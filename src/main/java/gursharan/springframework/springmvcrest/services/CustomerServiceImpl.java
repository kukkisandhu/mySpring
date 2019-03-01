package gursharan.springframework.springmvcrest.services;

import gursharan.springframework.springmvcrest.domain.Customer;
import gursharan.springframework.springmvcrest.repositories.CustomRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

private final CustomRepository customerRpository;

public CustomerServiceImpl(CustomRepository customerRpository){
    this.customerRpository=customerRpository;
}



    @Override
    public Customer findCustomerById(Long id) {
        return customerRpository.findById(id).get() ;
    }

    @Override
    public Customer saveCustomer(Customer mycustomer) {
        return customerRpository.save(mycustomer);
        }

    @Override
    public List<Customer> findAllCustomers() {

    return customerRpository.findAll();



    }
}
