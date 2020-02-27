package com.codeclan.example.coursebooking.repositories.CustomerRepository;

import com.codeclan.example.coursebooking.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long>, CustomerRepositoryCustom {
    List<Customer> findByBookingsCourseTitle(String title);
}
