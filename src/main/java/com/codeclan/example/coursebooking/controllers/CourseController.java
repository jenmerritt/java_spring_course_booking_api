package com.codeclan.example.coursebooking.controllers;

import com.codeclan.example.coursebooking.enums.Rating;
import com.codeclan.example.coursebooking.models.Course;
import com.codeclan.example.coursebooking.repositories.BookingRepository.BookingRepository;
import com.codeclan.example.coursebooking.repositories.CourseRepository.CourseRepository;
import com.codeclan.example.coursebooking.repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/courses")
public class CourseController {

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CourseRepository courseRepository;

    @GetMapping(value = "/rating/{ratingValue}")
    public List<Course> findByRating(@PathVariable int ratingValue){
        Rating value = Rating.values()[ratingValue];
        return courseRepository.findByRating(value);
    }

    @GetMapping(value = "/customer/{name}")
    public List<Course> findByBookingsCustomerName(@PathVariable String name){
        return courseRepository.findByBookingsCustomerName(name);
    }

}
