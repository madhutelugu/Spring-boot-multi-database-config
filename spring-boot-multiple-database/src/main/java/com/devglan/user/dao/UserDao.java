package com.devglan.user.dao;

import org.springframework.data.repository.CrudRepository;

import com.devglan.model.Role;

public interface UserDao extends CrudRepository<Role, Integer> {}
