package com.wahine.vippsstats.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import com.wahine.vippsstats.exception.ResourceNotFoundException;
import com.wahine.vippsstats.model.Customer;
import com.wahine.vippsstats.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class CustomerController {
    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/customers")
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @GetMapping("/customers/{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable(value = "id") Long customerId)
            throws ResourceNotFoundException {
        Customer customer = customerRepository.findById(customerId)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + customerId));
        return ResponseEntity.ok().body(customer);
    }
    /*
    @PostMapping("/customers")
    public Customer createEmployee(@Valid @RequestBody Customer customer) {
        return customerRepository.save(customer);
    }
     */

    /*
    @PutMapping("/customers/{id}")
    public ResponseEntity<Customer> updateEmployee(@PathVariable(value = "id") Long customerId,
                                                   @Valid @RequestBody Customer employeeDetails) throws ResourceNotFoundException {
        Customer customer = customerRepository.findById(employeeId)
                .orElseThrow(() -> new ResourceNotFoundException("Customer not found for this id :: " + customerId));

        customer.setEmailId(customerDetails.getEmailId());
        customer.setLastName(customerDetails.getLastName());
        customer.setFirstName(customerDetails.getFirstName());
        final Customer updatedCustomer = customerRepository.save(customer);
        return ResponseEntity.ok(updatedCustomer);
    }
     */

    /*
    @DeleteMapping("/customers/{id}")
    public Map<String, Boolean> deleteEmployee(@PathVariable(value = "id") Long customerId)
            throws ResourceNotFoundException {
        Customer employee = customerRepository.findById(customerId)
                .orElseThrow(() -> new ResourceNotFoundException("Customer not found for this id :: " + customerId));

        customerRepository.delete(employee);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
     */
}
