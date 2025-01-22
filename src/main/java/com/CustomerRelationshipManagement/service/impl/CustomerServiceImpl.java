package com.CustomerRelationshipManagement.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.CustomerRelationshipManagement.dao.CustomerDAO;
import com.CustomerRelationshipManagement.entity.Customer;
import com.CustomerRelationshipManagement.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	CustomerDAO customerDAO; //reference
	public CustomerServiceImpl(CustomerDAO customerDAO) {
		super();
		this.customerDAO = customerDAO;
	}

	@Override
	public String InsertCustomer(Customer customer) {
		//any logic when customer is insert record
		return customerDAO.insertCustomer(customer);
	}

	@Override
	public List<Customer> getCustomerList() {
		
		return customerDAO.getCustomersList();
	}

	@Override
	public Customer getCustomerById(int id) {
		
		return customerDAO.getCustomerById(id);
	}

	@Override
	public String updateCustomer(Customer customer) {
		
		return customerDAO.updateCustomer(customer);
	}

	@Override
	public String deleteCustomerById(int id) {
		
		return customerDAO.deleteCustomerById(id);
	}

	@Override
	public String insertMultipleCustomers(List<Customer> customers) {
	
		return customerDAO.insertMultipleCustomers(customers);
	}

	@Override
	public List<Customer> getCustomerByFirstName(String firstName) {
	
		return customerDAO.getCustomerByFirstName(firstName) ;
	}
	
	@Override
	public List<Customer> getCustomerByLessThanAge(int age){
		
		return customerDAO.getCustomerByLessThanAge(age);
	}

	@Override
	public List<Customer> getCustomerByMoreThanAge(int age) {
		
		return customerDAO.getCustomerByMoreThanAge(age);
	}

	@Override
	public List<Customer> getCoustommerByAge(int age) {
		
		return customerDAO.getCoustommerByAge(age);
	}

	@Override
	public List<Customer> getCustomerByLastName(String lastName) {
		
		return customerDAO.getCustomerByLastName(lastName);
	}

	@Override
	public List<Customer> getCustomerByEmail(String email) {
		
		return customerDAO.getCustomerByEmail(email);
	}

	@Override
	public List<Customer> getCustomerByMobile(String mobileNumber) {
	
		return customerDAO.getCustomerByMobile(mobileNumber);
	}

	@Override
	public String updateFirstName(int id, String firstName) {
		return customerDAO.updateFirstName(id, firstName);
	}

	@Override
	public String updateLastName(int id, String lastName) {
		
		return customerDAO.updateLastName(id, lastName);
	}

	@Override
	public String updateEmailId(int id, String emailid){
		
		return customerDAO.updateEmailId(id, emailid);
	}

	@Override
	public String updateMobile(int id, String mobile) {
		
		return customerDAO.updateMobile(id, mobile);
	}

	@Override
	public String updateAge(int id, int age) {
		
		return customerDAO.updateAge(id, age);
	}

	@Override
	public List<String> getCustomerByFname() {
		
		return customerDAO.getCustomerByFname();
	}

	@Override
	public List<String> getCustomerByLname() {
		
		return customerDAO.getCustomerByLname();
	}
	

}
