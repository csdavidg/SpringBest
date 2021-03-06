package com.david.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.david.springdemo.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Customer> getCustomers() {

		Session session = sessionFactory.getCurrentSession();

		Query<Customer> query = session.createQuery("from Customer order by lastName", Customer.class);

		return query.getResultList();
	}

	@Override
	public void saveCustomer(Customer customer) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(customer);
	}

	@Override
	public Customer getCustomer(Long customerId) {
		Session session = sessionFactory.getCurrentSession();
		return session.get(Customer.class, customerId);
	}

	@Override
	public void deleteCustomer(Long customerId) {
		Session session = sessionFactory.getCurrentSession();
		session.createQuery("delete from Customer where id = :customerId").setParameter("customerId", customerId)
				.executeUpdate();
	}

}
