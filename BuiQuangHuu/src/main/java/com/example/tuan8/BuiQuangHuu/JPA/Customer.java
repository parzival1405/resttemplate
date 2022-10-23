package com.example.tuan8.BuiQuangHuu.JPA;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @Column(name = "cus_id")
    private int CusId;

    private  String Name;
    @Column(name = "year_of_birth")
    private int YearOfBirth;

    public int getCusId() {
        return CusId;
    }

    public String getName() {
        return Name;
    }

    public int getYearOfBirth() {
        return YearOfBirth;
    }

    public void setCusId(int cusId) {
        CusId = cusId;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setYearOfBirth(int yearOfBirth) {
        YearOfBirth = yearOfBirth;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "CusId=" + CusId +
                ", Name='" + Name + '\'' +
                ", YearOfBirth=" + YearOfBirth +
                '}';
    }
}
