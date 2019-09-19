package com.models;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Admin {


	private int id;
	private String username;
	private String password;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public boolean isValidUser() {
		
			
			Configuration configuration = new Configuration().configure();
			SessionFactory sessionFactory =configuration.buildSessionFactory();
			Session session = sessionFactory.getCurrentSession();
			Transaction transaction= session.beginTransaction();
			
			String hql = "select a.username,a.password from Admin a where a.username=:usr and a.password=:pwd";
			Query query = session.createQuery(hql);
			query.setParameter("usr", username);
			query.setParameter("pwd",password);
			
			List<Admin> list = query.list();
			
			
			if(list.size()==1) {
				return true ;
			}
			else {
				return false;
			}
			
		
	}
	
	public List<Admin> getUsers(){
		
		Configuration configuration = new Configuration().configure();
		SessionFactory sessionFactory =configuration.buildSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction= session.beginTransaction();
		
		String hql ="from Admin where id=1";
		Query query = session.createQuery(hql);
		List<Admin> adminList = query.list();
		transaction.commit();
		session.close();
		
		return adminList;
	}
	
	
}
