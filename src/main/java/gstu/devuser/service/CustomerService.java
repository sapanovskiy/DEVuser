package gstu.devuser.service;

import java.util.List;

import gstu.devuser.entity.Customer;
import gstu.devuser.entity.Customer;

public interface CustomerService {

	public List<Customer> getCustomers();

	public Customer getCustomer(int theId);

	public void saveCustomer(Customer theCustomer);

	public void deleteCustomer(int theId);

}
