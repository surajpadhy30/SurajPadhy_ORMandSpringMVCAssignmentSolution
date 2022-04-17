package com.CRM.custService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CRM.entity.Customer;
import com.CRM.repository.CustomerRepo;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerRepo custRepo;
	
	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		return custRepo.findAll();
	}

	public Customer findById(int iID) {
		// TODO Auto-generated method stub
		return custRepo.findById(iID);
	}


	public void save(Customer sCust) {
		// TODO Auto-generated method stub
		custRepo.save(sCust);
	}

	public void deleteById(int iID) {
		// TODO Auto-generated method stub
		custRepo.deleteById(iID);
	}

}
