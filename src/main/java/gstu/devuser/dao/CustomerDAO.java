package gstu.devuser.dao;

import java.util.List;

import gstu.devuser.entity.Customer;
import gstu.devuser.entity.Customer;

public interface CustomerDAO {
	
	public List<Customer> getCustomers();
	
	public Customer getCustomer(int theId);
	
	public void saveCustomer(Customer theCustomer);
	
	public void deleteCustomer(int theId);

}
