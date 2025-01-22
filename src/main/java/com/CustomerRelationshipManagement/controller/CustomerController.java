package com.CustomerRelationshipManagement.controller;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CustomerRelationshipManagement.entity.Customer;
import com.CustomerRelationshipManagement.service.CustomerService;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

	CustomerService customerService;

	public CustomerController(CustomerService customerService) {
		super();
		this.customerService = customerService;
	}
	
	@PostMapping("/insert")
	public String insertCustomer(@RequestBody Customer customer) {
		
		return  customerService.InsertCustomer(customer);
		
	}
	
	@GetMapping()
	public List<Customer>getCustomersList(){
		
		return customerService.getCustomerList();
	}
	
	@GetMapping("/{id}")
	public Customer getCustomerById(@PathVariable int id) {
		
		return  customerService.getCustomerById(id);
	}
	
	@PutMapping
	public String updateCustomer(@RequestBody Customer customer) {
		
		return customerService.updateCustomer(customer);
	}
	
	@DeleteMapping("/{id}")
	public String deleteCustomerById(@PathVariable int id) {
		
		return customerService.deleteCustomerById(id);
	}
	
	@PostMapping
	public String insertMultipleCustomers(@RequestBody List<Customer>customers) {
	
		return customerService.insertMultipleCustomers(customers);
	}
	
	@GetMapping("/byname/{firstName}")
	public List<Customer> getCustomerByFirstName(@PathVariable String firstName ){
		
		return customerService.getCustomerByFirstName(firstName);
	}
	
	@GetMapping("/bylastname/{lastName}")
    public List<Customer> getCustomerByLastName(@PathVariable String lastName){
    	return customerService.getCustomerByLastName(lastName);
    }
	
	@GetMapping("/bylessthanage/{age}")
	public List<Customer> getCustomerByLessThanAge(@PathVariable int age){
		return customerService.getCustomerByLessThanAge(age);
	}
	
	@GetMapping("/bymorethanage/{age}")
	public List<Customer> getCustomerByMoreThanAge(@PathVariable int age){
		return customerService.getCustomerByMoreThanAge(age);
	}
	
	@GetMapping("/byage/{age}")
	public List<Customer> getCoustommerByAge(@PathVariable int age){
		return  customerService.getCoustommerByAge(age);
	}
	
	@GetMapping("/byemail/{email}")
	public List<Customer> getCustomerByEmail(@PathVariable String email){
		return customerService.getCustomerByEmail(email);
	}
	
	@GetMapping("/bymobile/{mobileNumber}")
	
	public List<Customer> getCustomerByMobile(@PathVariable String mobileNumber){
		return customerService.getCustomerByMobile(mobileNumber);
	}
	
	@PutMapping("/{id}")
	public String updateFirstNmae(@PathVariable int id, @RequestBody Map<String,String> request ) {
		String firstName=request.get("firstName");
		return customerService.updateFirstName(id, firstName);
	}
	 
	@PutMapping("/updateLname/{id}")
	public String updateLastName(@PathVariable int id, @RequestBody Map<String, String> request) {
		String lastName=request.get("lastName");
		return customerService.updateLastName(id, lastName);
	}
	
	@PutMapping("/updatemail/{id}")
	public String updateCustomerEmailId(@PathVariable int id, @RequestBody Map<String,String> request) {
		String emailid=request.get("emailid");
		return customerService.updateEmailId(id, emailid);
	}
	
	@PutMapping("/updateMo/{id}")
	public  String updateMobile(@PathVariable int id, @RequestBody Map<String,String> request) {
		String mobile=request.get("mobile");
		return customerService.updateMobile(id, mobile);
	}
	
	@PutMapping("/UpdateAge/{id}")
	public String updateAge(@PathVariable int id, @RequestBody Map<String,Integer> request) {
		Integer age=request.get("age");
		return customerService.updateAge(id, age);
	}
	
	@GetMapping("/firstNames")
	public List<String> getCustomerByFname(){
		return customerService.getCustomerByFname();
	}
	
	@GetMapping("/lastNames")
	public List<String> getCustomerByLname(){
		return customerService.getCustomerByLname();
	}
}



