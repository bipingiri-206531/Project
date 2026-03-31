package com.practice2.practice2.service;

import com.practice2.practice2.entity.Customer;
import com.practice2.practice2.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    public Customer saveCustomer(Customer customer){
       return customerRepository.save(customer);
    }

    public Customer getCustomerById(Long id) {
        return customerRepository.findById(id).orElse(null);
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Customer updateCustomer(Long id, Customer updatedCustomer) {
        Customer existingCustomer = customerRepository.findById(id).orElse(null);
        if (existingCustomer != null) {
            existingCustomer.setName(updatedCustomer.getName());
            existingCustomer.setPhone(updatedCustomer.getPhone());
            existingCustomer.setEmail(updatedCustomer.getEmail());
            return customerRepository.save(existingCustomer);
        }
        return null;
    }

    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }


}
