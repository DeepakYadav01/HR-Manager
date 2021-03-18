package com.java.advancejava.webservices.assignment.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.advancejava.webservices.assignment.model.HR;
import com.java.advancejava.webservices.assignment.service.HrAuthentication;
import com.java.advancejava.webservices.assignment.service.HrRepository;

@Service
public class HrAuthenticationImpl implements HrAuthentication {

	@Autowired
	private HrRepository hrRepository;

	public boolean authentication(HR _hr) {
		boolean isValidUser = false;
		if ((!(_hr.getUsername().equals(""))) && (!(_hr.getPassword().equals("")))) {
			HR hr = hrRepository.getHr(_hr);
			if (!(hr == null) && hr.getPassword().equals(_hr.getPassword())) {
				isValidUser = true;
			} else {
				isValidUser = false;
			}
		} else {
			isValidUser = false;
		}
		return isValidUser;
	}
}
