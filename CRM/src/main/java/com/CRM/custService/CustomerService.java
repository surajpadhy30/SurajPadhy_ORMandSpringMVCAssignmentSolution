package com.CRM.custService;

import java.util.List;

import org.springframework.stereotype.Service;

import com.CRM.entity.Customer;

@Service
public interface CustomerService {

	public List<Customer> findAll();

	public Customer findById(int iID);

	public void save(Customer sCust);

	public void deleteById(int iID);
	
}
