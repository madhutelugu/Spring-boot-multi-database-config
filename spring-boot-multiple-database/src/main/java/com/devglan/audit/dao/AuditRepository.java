package com.devglan.audit.dao;

import org.springframework.data.repository.CrudRepository;

import com.devglan.model.AuditDetails;

public interface AuditRepository extends CrudRepository<AuditDetails, Integer> {}

