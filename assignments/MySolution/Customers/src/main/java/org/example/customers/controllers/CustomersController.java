package org.example.customers.controllers;


import org.example.customers.models.Customers;
import org.example.customers.repos.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/v2/customers")
public class CustomersController {

    @Autowired
    private CustomerRepository customerRepository;

    //CREATE
    @RequestMapping(method = RequestMethod.PUT)
    public void setUser(@RequestBody Customers customers){
        customerRepository.save(customers);
        System.out.println(customers);
    }

    //READ
    @RequestMapping(value = "/{customerId}", method = RequestMethod.GET)
    public Customers getCustomer(@PathVariable String customerId){
        Optional<Customers> customerOpt = customerRepository.findById(customerId);
        if(customerOpt.isPresent()){
            return customerOpt.get();
        }else{
            return null;
        }
    }

    // UPDATE
    @RequestMapping(value = "/{customerId}", method = RequestMethod.POST)
    public Customers modifyUser(@RequestBody Customers customers, @RequestBody String customerId ) {
        return customerRepository.save(customers);
    }

    // DELETE ALL
    @RequestMapping(method = RequestMethod.DELETE)
    public void deleteAllCustomers() {
        customerRepository.deleteAll();
    }

    //DELETE BY ID
    @RequestMapping(value = "/{userId}", method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable String customerId) {
        customerRepository.deleteById(customerId);
    }




}
