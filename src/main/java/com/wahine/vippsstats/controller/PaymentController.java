package com.wahine.vippsstats.controller;

import com.wahine.vippsstats.exception.ResourceNotFoundException;
import com.wahine.vippsstats.model.Customer;
import com.wahine.vippsstats.model.Payment;
import com.wahine.vippsstats.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
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
    @GetMapping("/payments/{customer_id}")
    public ResponseEntity<List<Payment>> getPaymentsByCustomerId(@PathVariable(value = "customer_id") int customerId)
            throws ResourceNotFoundException {
        List<Payment> payments = getAllPayments();
        List<Payment> customer_payment = new ArrayList<>();
        for (Payment payment : payments) {
            if (payment.getcustomerID() == customerId) {
                customer_payment.add(payment);
            }
        }
        return ResponseEntity.ok().body(customer_payment);
    }
    */


    @GetMapping("/payments/{customer_id}")
    public List<Payment> getPaymentsByCustomerId(@PathVariable(value = "customer_id") int customerId)
            throws ResourceNotFoundException {
        List<Payment> payments = getAllPayments();
        List<Payment> customer_payment = new ArrayList<>();
        for (Payment payment : payments) {
            if (payment.getcustomerID() == customerId) {
                customer_payment.add(payment);
            }
        }
        return customer_payment;
    }

    /*
    @GetMapping("/payments/{customer_id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable(value = "customer_id") int customerId)
            throws ResourceNotFoundException {
        Payment payment = paymentRepository.findById(customerId)
                .orElseThrow(() -> new ResourceNotFoundException("Customer not found for this id :: " + customerId));
        return ResponseEntity.ok().body(payment);
    }
     */

    /*
    @GetMapping("/payments/{customer_id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable(value = "customer_id") int customerId) throws ResourceNotFoundException {
        //Payment payment = paymentRepository.findById(customerId)
          //      .orElseThrow(() -> new ResourceNotFoundException("Customer not found for this id :: " + customerId));

        return returnStats(customerId);
    }
    */
}
