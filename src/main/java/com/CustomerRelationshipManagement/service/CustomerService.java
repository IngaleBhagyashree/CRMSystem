package com.CustomerRelationshipManagement.service;

import java.util.List;

import com.CustomerRelationshipManagement.entity.Customer;

public interface CustomerService {

	
	
	String InsertCustomer(Customer customer);
	List<Customer> getCustomerList();
	Customer getCustomerById(int id);
	String updateCustomer(Customer customer);
	String deleteCustomerById(int id);
	String insertMultipleCustomers(List<Customer> customers);
	List<Customer> getCustomerByFirstName(String firstName );
	List<Customer> getCustomerByLastName(String lastName);
	List<Customer> getCustomerByLessThanAge(int age);
	List<Customer> getCustomerByMoreThanAge(int age);
	List<Customer> getCoustommerByAge(int age);
	List<Customer> getCustomerByEmail(String email);
	List<Customer> getCustomerByMobile(String mobileNumber);
	String updateFirstName(int id, String firstName);
	String updateLastName(int id,String lastName);
	String updateEmailId(int id, String emailid);
	String updateMobile(int id, String mobile);
	String updateAge(int id, int age);
	List<String> getCustomerByFname();
	 List<String> getCustomerByLname();
	
}
