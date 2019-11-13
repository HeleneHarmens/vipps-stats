package com.wahine.vippsstats.controller;

import com.wahine.vippsstats.exception.ResourceNotFoundException;
import com.wahine.vippsstats.model.Stats;
import com.wahine.vippsstats.repository.StatsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class StatsController {

    @Autowired
    private StatsRepository statsRepository;

    @GetMapping("/stats")
    public List<Stats> getAllCustomers() {
        return statsRepository.findAll();
    }

    @GetMapping("/stats/{customer_id}")
    public ResponseEntity<Stats> getCustomerById(@PathVariable(value = "customer_id") int customerId)
            throws ResourceNotFoundException {
        Stats stats = statsRepository.findById(customerId)
                .orElseThrow(() -> new ResourceNotFoundException("Customer not found for this id :: " + customerId));
        return ResponseEntity.ok().body(stats);
    }
}
