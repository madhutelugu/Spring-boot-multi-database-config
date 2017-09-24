package com.devglan.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.devglan.audit.dao.AuditRepository;
import com.devglan.model.AuditDetails;
import com.devglan.model.Role;
import com.devglan.user.dao.UserDao;

@RestController
@RequestMapping("/booking")
public class BookingController {
	
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private AuditRepository auditRepository;

	@RequestMapping(method = RequestMethod.GET)
	public List<Role> getRole() {
		List<Role> roles = new ArrayList<Role>();
		userDao.findAll().forEach(roles::add);
		return roles;
	}
	
	@RequestMapping(path="/audit", method = RequestMethod.GET)
	public List<AuditDetails> getAudit() {
		List<AuditDetails> audits = new ArrayList<AuditDetails>();
		auditRepository.findAll().forEach(audits::add);
		return audits;
	}

}
