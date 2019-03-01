package gursharan.springframework.springmvcrest.controllers;
import java.util.*;
import gursharan.springframework.springmvcrest.domain.Customer;
import gursharan.springframework.springmvcrest.services.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(CustomerController.BASE_URL )
public class CustomerController {
    public static final String BASE_URL="/api/v1/customers";

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService){
        this.customerService=customerService;
    }

@GetMapping
    List<Customer> getAllCustomers(){
        return customerService.findAllCustomers();
    }
    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable Long id){
        return customerService.findCustomerById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Customer saveCustomer(@RequestBody Customer mycustomer){
      return customerService.saveCustomer(mycustomer);

    }

}
