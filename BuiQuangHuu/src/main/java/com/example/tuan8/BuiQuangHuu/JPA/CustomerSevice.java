package com.example.tuan8.BuiQuangHuu.JPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerSevice {
    @Autowired
    private Repository repository;
    public List<Customer> getAllCustomer() {
        return repository.findAll();
    }

    public void addCustomer(Customer customer){
        repository.save(customer);
    }
}
