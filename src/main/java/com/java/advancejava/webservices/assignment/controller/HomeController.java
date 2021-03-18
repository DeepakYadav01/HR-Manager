package com.java.advancejava.webservices.assignment.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.java.advancejava.webservices.assignment.model.Employee;
import com.java.advancejava.webservices.assignment.serviceimpl.EmployManagementServiceImpl;

@Controller
public class HomeController {

	@Autowired
	private EmployManagementServiceImpl employManagementServiceImpl;

	@RequestMapping(path = "/home", method = RequestMethod.GET)
	public String homePage(@ModelAttribute("username") String un, @ModelAttribute("password") String pswd,
			HttpServletRequest request) {

		List<Employee> empList = employManagementServiceImpl.getAllEmploys();
		request.getSession().setAttribute("empList", empList);
		request.getSession().setAttribute("username", un);
		System.out.println("Succefully loggedin : " + un);
		return "home";

	}

	@RequestMapping(path = "/home", method = RequestMethod.POST)
	public String homePage(HttpServletRequest request, RedirectAttributes rattrs) {

		String un = request.getParameter("username");
		System.out.println(un);
		rattrs.addFlashAttribute("username", un);
		return "upload";

	}

}
