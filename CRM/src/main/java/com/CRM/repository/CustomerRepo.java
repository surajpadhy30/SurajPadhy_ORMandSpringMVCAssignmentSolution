package com.CRM.repository;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.CRM.entity.Customer;



@Repository
public class CustomerRepo {

	private Session session;

	@Autowired
	public CustomerRepo(SessionFactory sessionFactory) {
		//this.sessionFactory = sessionFactory;
		this.session = sessionFactory.openSession();
		try {
			session = sessionFactory.getCurrentSession();
		} catch (HibernateException e) {
			session = sessionFactory.openSession();
		}
	}
	
	@Transactional
	public List<Customer> findAll(){
		Transaction tx = session.beginTransaction();
		List<Customer> customerList = session.createQuery("from Customer", Customer.class).list();
		tx.commit();
		return customerList;
	}
	
	@Transactional
	public Customer findById(int id){
		Transaction tx = session.beginTransaction();
		Customer customer = session.get(Customer.class, id);
		tx.commit();
		return customer;
	}

	@Transactional
	public void save(Customer theCustomer){
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(theCustomer);
		tx.commit();
	}

	@Transactional
	public void deleteById(int theId) {
		Transaction tx = session.beginTransaction();
		Customer customer = (Customer)session.load(Customer.class, theId);
		System.out.println(customer);
		if(customer!=null) {
			session.delete(customer);
		}
		tx.commit();
	}
	
}
