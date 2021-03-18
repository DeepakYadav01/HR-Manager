package com.java.advancejava.webservices.assignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.java.advancejava.webservices.assignment.model.HR;
import com.java.advancejava.webservices.assignment.service.HrAuthentication;

@Controller

public class LoginController {

	String redirect = null;
	static String errorMessage = "";
	@Autowired
	private HrAuthentication hrAuthentication;

	@RequestMapping(path = "/login", method = RequestMethod.GET)
	public String loginPage() {
		return "login";
	}

	@RequestMapping(path = "/login", method = RequestMethod.POST)
	public String loginPage(@ModelAttribute("hr") HR hr, RedirectAttributes rattrs) {
		if (hrAuthentication.authentication(hr)) {
			rattrs.addFlashAttribute("username", hr.getUsername());
			rattrs.addFlashAttribute("password", hr.getPassword());
			redirect = "redirect:home";
		} else {
			redirect = "login";
		}
		return redirect;

	}
}
