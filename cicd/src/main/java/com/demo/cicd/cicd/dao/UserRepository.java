package com.demo.cicd.cicd.dao;

import org.springframework.data.repository.CrudRepository;

import com.demo.cicd.cicd.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
