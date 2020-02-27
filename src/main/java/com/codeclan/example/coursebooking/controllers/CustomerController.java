package com.codeclan.example.coursebooking.controllers;

import com.codeclan.example.coursebooking.models.Customer;
import com.codeclan.example.coursebooking.repositories.BookingRepository.BookingRepository;
import com.codeclan.example.coursebooking.repositories.CourseRepository.CourseRepository;
import com.codeclan.example.coursebooking.repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CourseRepository courseRepository;

    @GetMapping(value = "/course/{course}")
    public List<Customer> findByBookingsCourseTitle(@PathVariable String course){
        return customerRepository.findByBookingsCourseTitle(course);
    }

    @GetMapping(value = "/search/townandtitle")
    public List<Customer> findByTownAndBookingsCourseTitle(@RequestParam String town, String title){
        return customerRepository.findByTownAndBookingsCourseTitle(town, title);
    }

    @GetMapping(value = "/search/agetowntitle")
    public List<Customer> findByAgeGreaterThanAndTownAndBookingsCourseTitle(@RequestParam int age, String town, String title) {
        return customerRepository.findByAgeGreaterThanAndTownAndBookingsCourseTitle(age, town, title);
    }

    @GetMapping(value="/custom/course/{course}")
    public List<Customer> getCustomersForCourse(@PathVariable String course){
        return customerRepository.getCustomersForCourse(course);
    }

    @GetMapping(value="/custom/townandcourse")
    public List<Customer> getCustomersInTownForCourse(@RequestParam String town, String course){
        return customerRepository.getCustomersInTownForCourse(town, course);
    }
}
