package com.moapp.mavenSSH.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moapp.mavenSSH.beans.User;
import com.moapp.mavenSSH.dao.UserDao;
import com.moapp.mavenSSH.service.UserManager;

@Service("userManager")
public class UserManagerImpl implements UserManager {
	@Autowired
	UserDao userDao;

	@Override
	public User load(Integer id) {
		return null;
	}

	@Override
	public User get(Integer id) {
		return userDao.get(id);
	}

	@Override
	public List<User> findAll() {
		return userDao.findAll();
	}

	@Override
	public void persist(User entity) {
		userDao.persist(entity);
	}

	@Override
	public Integer save(User entity) {
		return userDao.save(entity);
	}

	@Override
	public void saveOrUpdate(User entity) {
		userDao.saveOrUpdate(entity);
	}

	@Override
	public void delete(Integer id) {
		userDao.delete(id);
	}

	@Override
	public void flush() {
		userDao.flush();
	}

}
