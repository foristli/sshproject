package com.moapp.mavenSSH.service;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.moapp.mavenSSH.beans.User;

@Transactional
public interface UserManager {
	User load(Integer id);
	User get(Integer id);
	List<User> findAll();
	void persist(User entity);
	Integer save(User entity);
	void saveOrUpdate(User entity);
	void delete(Integer id);
	void flush();
}