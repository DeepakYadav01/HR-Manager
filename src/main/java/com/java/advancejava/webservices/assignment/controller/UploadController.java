package com.java.advancejava.webservices.assignment.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.java.advancejava.webservices.assignment.model.Employee;
import com.java.advancejava.webservices.assignment.serviceimpl.EmployManagementServiceImpl;

@Controller
public class UploadController {

	@Autowired
	EmployManagementServiceImpl employManagementServiceImpl;

	@RequestMapping(path = "/upload", method = RequestMethod.GET)
	public String uploadPage(@ModelAttribute("username") String un, HttpServletRequest request) {

		request.getSession().setAttribute("username", un);
		return "upload";
	}

	@RequestMapping(path = "/upload", method = RequestMethod.POST)
	public String uploadPage(@ModelAttribute("emp") Employee emp) {

		employManagementServiceImpl.addEmployee(emp);
		return "redirect:home";

	}

	@RequestMapping(path = "/update", method = RequestMethod.GET)
	public String uploadedPage(@ModelAttribute("username") String un, HttpServletRequest request) {

		request.getSession().setAttribute("username", un);
		return "upload";
	}

	@RequestMapping(path = "/update", method = RequestMethod.POST)
	public String updatePage() {
		return "update";

	}

	@RequestMapping(path = "/updatedata", method = RequestMethod.POST)
	public String updateDataPage(@ModelAttribute("emp") Employee emp) {
		if (emp.getEmpName().length() <= 100 && emp.getLocation().length() <= 500 && emp.getEmail().length() <= 100) {
			employManagementServiceImpl.updateEmployee(emp);
			System.out.println(emp.getEmpName());
			return "home";
		} else {
			return "update";
		}

	}

}
