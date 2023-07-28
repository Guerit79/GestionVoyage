package com.voyage.voyageapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.voyage.voyageapp.bll.UserService;
import com.voyage.voyageapp.bo.LoginForm;
import com.voyage.voyageapp.bo.Travel;
import com.voyage.voyageapp.bo.User;

@RestController
@RequestMapping(value="/api/utilisateurs")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

	@Autowired
	UserService userService;
	
	
	@RequestMapping(value="/findAllUser", method=RequestMethod.GET)
	public ModelAndView findAllUser() {
		ModelAndView mv = new ModelAndView();;
		mv.addObject("user", userService.findAllUser());
		return mv;
	}
	
	@PostMapping("/login")
	  public ResponseEntity<?> login(@RequestBody LoginForm loginForm) {
	    // Take all data on Form (pseudo & mdp)
	    String pseudo = loginForm.getPseudo();
	    String mdp = loginForm.getMdp();
	    
	    // if user exist in BDD
	    User user = userService.findUserByPseudo(pseudo);
	    if (user == null) {
	      // if user dosen't exist, return an error
	      return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Identifiants invalides");
	    }

	    // compared the password received to password in BDD 
	    if (!userService.checkPassword(user, mdp)) {
	      // Failed password, return error
	      return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Identifiants invalides");
	    }

	    // success login, give the role to user
	    String role = user.getId_role_utilisateur().getNomRole();

	    // return a response in terms of role user 
	    if (role.equalsIgnoreCase("admin")) {
	      return ResponseEntity.ok(user);
	    } else {
	      return ResponseEntity.ok(user);
	    }
	 }
	   
    @GetMapping("/{id}/voyages-favoris")
    public ResponseEntity<List<Travel>> getVoyageFavorisUtilisateur(@PathVariable int id) {
    	System.out.println(id);
        List<Travel> voyagesFavoris = userService.getVoyagesFavoris(id);
        System.out.println(voyagesFavoris);
        return new ResponseEntity<>(voyagesFavoris, HttpStatus.OK);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable int id) {
    	User utilisateur = userService.getById(id);
        if (utilisateur != null) {
            return ResponseEntity.ok(utilisateur);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
	  

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<String> handleNotFoundException(NotFoundException exception) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(exception.getMessage());
    }
}