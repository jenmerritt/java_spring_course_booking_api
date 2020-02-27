package com.codeclan.example.coursebooking.repositories.CustomerRepository;

import com.codeclan.example.coursebooking.models.Customer;

import java.util.List;

public interface CustomerRepositoryCustom {

    List<Customer> getCustomersForCourse(String title);

    List<Customer> getCustomersInTownForCourse(String town, String course);
}
