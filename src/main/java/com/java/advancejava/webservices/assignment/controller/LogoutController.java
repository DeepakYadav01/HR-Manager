package com.java.advancejava.webservices.assignment.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LogoutController {

	@RequestMapping(path = "/logout", method = RequestMethod.GET)
	public String logout() {
		System.out.println("Please login first");
		return "redirect:login";
	}

	@RequestMapping(path = "/logout", method = RequestMethod.POST)
	public String logout(HttpServletRequest request) {
		System.out.println("Succefully loggedout :" + request.getParameter("username"));
		return "redirect:login";
	}
}
