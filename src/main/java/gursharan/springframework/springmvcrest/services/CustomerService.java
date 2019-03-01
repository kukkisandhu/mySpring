package gursharan.springframework.springmvcrest.services;

import gursharan.springframework.springmvcrest.domain.Customer;
import java.util.*;

public interface CustomerService  {

    Customer findCustomerById(Long Id);
List<Customer> findAllCustomers();
    Customer saveCustomer(Customer mycustomer) ;




}
