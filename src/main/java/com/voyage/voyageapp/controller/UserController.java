package com.voyage.voyageapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.voyage.voyageapp.bll.UserService;

@Controller
@RequestMapping(value="/api/utilisateurs")
public class UserController {

	@Autowired
	UserService userService;
	
	
	@RequestMapping(value="/findAllUser", method=RequestMethod.GET)
	public ModelAndView findAllUser() {
		ModelAndView mv = new ModelAndView();;
		mv.addObject("user", userService.findAllUser());
		return mv;
	}

}