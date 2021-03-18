package com.java.advancejava.webservices.assignment.serviceimpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.java.advancejava.webservices.assignment.constants.ApiConstants;
import com.java.advancejava.webservices.assignment.model.Employee;
import com.java.advancejava.webservices.assignment.service.EmployManagementService;

@Service
public class EmployManagementServiceImpl implements EmployManagementService {

	private static RestTemplate template;

	public List<Employee> getAllEmploys() {
		try {
			template = new RestTemplate();
			String url = ApiConstants.GET_ALL_EMPLOYEE;

			MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter = new MappingJackson2HttpMessageConverter();
			mappingJackson2HttpMessageConverter.setSupportedMediaTypes(
					Arrays.asList(MediaType.APPLICATION_JSON, MediaType.APPLICATION_OCTET_STREAM));
			template.getMessageConverters().add(mappingJackson2HttpMessageConverter);

			ResponseEntity<List<Employee>> entity = template.exchange(url, HttpMethod.GET, null,
					new ParameterizedTypeReference<List<Employee>>() {
					});
			List<Employee> empList = entity.getBody();
			return empList;
		} catch (Exception e) {
			return new ArrayList<Employee>();
		}

	}

	public void addEmployee(Employee employee) {
		String url = ApiConstants.ADD_EMPLOYEE;
		template = new RestTemplate();
		HttpEntity<Employee> request = new HttpEntity<Employee>(employee);
		template.postForObject(url, request, Employee.class);
	}

	public void updateEmployee(Employee emp) {
		String url = ApiConstants.UPDATE_EMPLOYEE;
		template = new RestTemplate();
		HttpEntity<Employee> request = new HttpEntity<Employee>(emp);
		template.put(url, request);
	}

	public void delete(int id) {

		String url = ApiConstants.DELETE_EMPLOYEE + id;
		template = new RestTemplate();
		template.delete(url);
	}

}
