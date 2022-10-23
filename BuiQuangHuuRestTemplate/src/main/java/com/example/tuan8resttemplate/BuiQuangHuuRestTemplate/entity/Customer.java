package com.example.tuan8resttemplate.BuiQuangHuuRestTemplate.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    private int CusId;
    private  String Name;
    private int YearOfBirth;
}
