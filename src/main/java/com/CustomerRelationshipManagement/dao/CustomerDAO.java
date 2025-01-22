package com.CustomerRelationshipManagement.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.CustomerRelationshipManagement.entity.Customer;

@Repository
public class CustomerDAO {

	//DATABASE CODE
	@Autowired
	SessionFactory sf;

	public CustomerDAO(SessionFactory sf) {
		super();
		this.sf = sf;
	}
	
	public String insertCustomer(Customer customer) {
		
		Session session =sf.openSession();
		Transaction tr=session.beginTransaction();
		// innsert update delete ->you need to use Transaction
		//save is a method of session
		session.save(customer); //Deprecated (by this method data goes to DAO->database) to insert data
		tr.commit();
		session.close();
		return "Customer insert successfully"; //this message goes to service (DAO->sevrice)
	}
	
	public List<Customer> getCustomersList() {
		
		Session session =sf.openSession();
		return session.createQuery("from Customer").list();
		
	}
	
	public Customer getCustomerById(int id) {
		//get -> it will return null if obj not found in db
		//load-> it will return objectNotFoundException if obj not found in db
		Session session =sf.openSession();
		Customer customer=session.get(Customer.class, id);
		return customer;

	}
	
	public String updateCustomer(Customer customer){
		
		Session session =sf.openSession();
		Transaction tr = session.beginTransaction();
		session.update(customer);
		tr.commit();
		session.close();
		return "Customer update succesfully";
	}
	
	public String deleteCustomerById(int id) {
		Session session =sf.openSession();
		Transaction tr=session.beginTransaction();
		Customer customer=session.get(Customer.class,id);
		session.delete(customer);
		tr.commit();
		session.close();
		return "Customer delete successfully";
	}
	
	public String insertMultipleCustomers(List<Customer> customers) {
		
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		for(Customer customer:customers) {
			session.save(customer);
		}
		tr.commit();
		session.close();
		return "Customers are inserted successfully";
	}
	
	public List<Customer> getCustomerByFirstName(String firstName ){
	
		Session session=sf.openSession();
		//HQL Query
		Query<Customer>customers= session.createQuery("from Customer c where c.firstName=:firstName",Customer.class);
		customers.setParameter("firstName", firstName);//columnName,variableName
		List<Customer> list=customers.list();
		return list;
	}
	
	public List<Customer> getCustomerByLastName(String lastName){
		
		Session session=sf.openSession();
		Query<Customer> customers=session.createQuery("from Customer c where c.lastName=:lastName",Customer.class);
		customers.setParameter("lastName", lastName);
		List<Customer> list=customers.list();
		return list;
	}

	public List<Customer> getCustomerByLessThanAge(int age){
		
		Session session=sf.openSession();
		//HQL query
		Query<Customer> customer= session.createQuery("from Customer c where c.age<=:age",Customer.class);
		customer.setParameter("age", age);
		List<Customer> list=customer.list();
		return list;
	}
	
     public List<Customer> getCustomerByMoreThanAge(int age){
		
		Session session=sf.openSession();
		//HQL query
		Query<Customer> customer= session.createQuery("from Customer c where c.age>=:age",Customer.class);
		customer.setParameter("age", age);
		List<Customer> list=customer.list();
		return list;
	}
     
     public List<Customer> getCoustommerByAge(int age){
    	 
    	 Session session=sf.openSession();
    	Query<Customer> customer= session.createQuery("from Customer c where c.age=:age",Customer.class);
    	 customer.setParameter("age", age);
    	 List<Customer> list=customer.list();
    	 return list;
     }
     
     public List<Customer>getCustomerByEmail(String email){
    	 Session session= sf.openSession();
    	 Query<Customer> customer=session.createQuery("from Customer c where c.email=:email",Customer.class);
    	 customer.setParameter("email", email);
    	 List<Customer> list=customer.list();
    	 return list;
     }
     
     public List<Customer> getCustomerByMobile(String mobileNumber){
    	 Session session=sf.openSession();
    	 Query<Customer> customers=session.createQuery("from Customer c where c.mobileNumber=:mobileNumber",Customer.class);
    	 customers.setParameter("mobileNumber", mobileNumber);
    	 List<Customer>list=customers.list();
    	 return list;
     }
     
     public String updateFirstName(int id, String firstName) {
    	 Session session=sf.openSession();
    	 Transaction tr=session.beginTransaction();
    	 Customer customer=session.get(Customer.class,id); 
    	 customer.setFirstName(firstName);
    	 tr.commit();
    	 session.close();
    	 return "Customer fName updated succesfully"; 
     }
     
     public String updateLastName(int id,String lastName) {
    	Session session= sf.openSession();
    	Transaction tr= session.beginTransaction();
    	Customer customer=session.get(Customer.class, id);
    	customer.setLastName(lastName);
    	tr.commit();
    	session.close();
    	return "Customer lname updated";
     }
     
     public String updateEmailId(int id, String emailid) {
    	 Session session=sf.openSession();
    	 Transaction tr= session.beginTransaction();
    	 Customer customer= session.get(Customer.class, id);
    	 customer.setEmail(emailid);
    	 tr.commit();
    	 session.close();
    	 return "Customer Email updated";
     }
     
     public String updateMobile(int id, String mobile) {
    	 Session session=sf.openSession();
    	 Transaction tr= session.beginTransaction();
    	 Customer customer= session.get(Customer.class, id);
    	 customer.setMobileNumber(mobile);
    	 tr.commit();
    	 session.close();
    	 return "Customer Email updated";
     }
     
     public String updateAge(int id, int age) {
    	 Session session=sf.openSession();
    	 Transaction tr= session.beginTransaction();
    	 Customer customer= session.get(Customer.class, id);
    	 customer.setAge(age);
    	 tr.commit();
    	 session.close();
    	 return "Customer Age updated";
     }
    
     public List<String> getCustomerByFname(){
    	 Session session=sf.openSession();
    	return session.createQuery("select c.firstName from Customer c").list();
    	 
     }
     
     public List<String> getCustomerByLname(){
    	 Session session=sf.openSession();
    	return session.createQuery("select c.lastName from Customer c").list();
    	 
     }
     
}


