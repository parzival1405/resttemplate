package com.example.tuan8resttemplate.BuiQuangHuuRestTemplate.controller;

import com.example.tuan8resttemplate.BuiQuangHuuRestTemplate.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/")
    public List<Customer> getCustomer() {
        ResponseEntity<List<Customer>> entity =
                restTemplate.exchange("/", HttpMethod.GET,null, new ParameterizedTypeReference<List<Customer>>() {
                });
        return entity.getBody();
    }

    @PostMapping("/")
    public void saveCustomer(@RequestBody Customer customer) {
                restTemplate.postForEntity("/",customer, Customer.class);
    }
}
