package com.example.tuan8.BuiQuangHuu.JPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/Customer")
public class CustomerController {
    @Autowired
    private CustomerSevice Sevice;
    @GetMapping("")
    List<Customer> getCustomer() {
        return Sevice.getAllCustomer();
    }

    @PostMapping ("")
    void saveCustomer(@RequestBody Customer customer) {
        Sevice.addCustomer(customer);
    }
}
