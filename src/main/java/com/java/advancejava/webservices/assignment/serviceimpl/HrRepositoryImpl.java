package com.java.advancejava.webservices.assignment.serviceimpl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.java.advancejava.webservices.assignment.model.HR;
import com.java.advancejava.webservices.assignment.service.HrRepository;

@Repository
public class HrRepositoryImpl implements HrRepository {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Transactional
	public HR getHr(HR _hr) {
		try {
			HR hr = hibernateTemplate.get(HR.class, _hr.getUsername());
			return hr;
		} catch (Exception e) {
			return null;
		}

	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
}
