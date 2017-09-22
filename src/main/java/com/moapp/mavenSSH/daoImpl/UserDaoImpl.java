package com.moapp.mavenSSH.daoImpl;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.moapp.mavenSSH.beans.User;
import com.moapp.mavenSSH.dao.UserDao;

@Repository("UserDao")
public class UserDaoImpl implements UserDao{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public User load(Integer id) {
		return (User) getCurrentSession().load(User.class, id);
				//.load(User.class, id);
	}

	@Override
	public User get(Integer id) {
		return (User) getCurrentSession().get(User.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> findAll() {
		return getCurrentSession().createQuery("from user").list();
	}

	@Override
	public void persist(User entity) {
		getCurrentSession().persist(entity);
	}

	@Override
	public Integer save(User entity) {
		int id=(Integer)getCurrentSession().save(entity);

		return id;
	}

	@Override
	public void saveOrUpdate(User entity) {
		getCurrentSession().saveOrUpdate(entity);
	}

	@Override
	public void delete(Integer id) {
		getCurrentSession().delete(this.get(id));
	}

	@Override
	public void flush() {
		getCurrentSession().flush();
	}

}


