package com.wahine.vippsstats.controller;

import com.wahine.vippsstats.exception.ResourceNotFoundException;
import com.wahine.vippsstats.model.Customer;
import com.wahine.vippsstats.model.Payment;
import com.wahine.vippsstats.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class PaymentController {
    @Autowired
    private PaymentRepository paymentRepository;

    @GetMapping("/payments")
    public List<Payment> getAllPayments() {
            return paymentRepository.findAll();
    }
/*
    @PostMapping("/customers")
    public Customer createCustomer(@Valid @RequestBody Customer customer) {
        return customerRepository.save(customer);
    }

    @PutMapping("/customers/{customer_id}")
    public ResponseEntity<Customer> updateCustomer(@PathVariable(value = "customer_id") int customerId,
                                                   @Valid @RequestBody Customer customerDetails) throws ResourceNotFoundException {
        Customer customer = customerRepository.findById(customerId)
                .orElseThrow(() -> new ResourceNotFoundException("Customer not found for this id :: " + customerId));

        customer.setEmailId(customerDetails.getEmailId());
        customer.setLastName(customerDetails.getLastName());
        customer.setFirstName(customerDetails.getFirstName());
        final Customer updatedCustomer = customerRepository.save(customer);
        return ResponseEntity.ok(updatedCustomer);
    }

    @DeleteMapping("/customers/{customer_id}")
    public Map<String, Boolean> deleteCustomer(@PathVariable(value = "customer_id") int customerId)
            throws ResourceNotFoundException {
        Customer customer = customerRepository.findById(customerId)
                .orElseThrow(() -> new ResourceNotFoundException("Customer not found for this id :: " + customerId));

        customerRepository.delete(customer);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }

 */

}
