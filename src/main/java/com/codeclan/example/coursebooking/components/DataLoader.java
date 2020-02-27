package com.codeclan.example.coursebooking.components;

import com.codeclan.example.coursebooking.enums.Rating;
import com.codeclan.example.coursebooking.models.Booking;
import com.codeclan.example.coursebooking.models.Course;
import com.codeclan.example.coursebooking.models.Customer;
import com.codeclan.example.coursebooking.repositories.BookingRepository.BookingRepository;
import com.codeclan.example.coursebooking.repositories.CourseRepository.CourseRepository;
import com.codeclan.example.coursebooking.repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args){

        Customer customer1 = new Customer("Brian", "Livingston", 43);
        customerRepository.save(customer1);

        Customer customer2 = new Customer("Jane", "North Berwick", 39);
        customerRepository.save(customer2);

        Customer customer3 = new Customer("Andrew", "Dunfermline", 21);
        customerRepository.save(customer3);

        Course course1 = new Course("Java", "Edinburgh", Rating.ONE);
        courseRepository.save(course1);

        Course course2 = new Course("JavaScript", "Glasgow", Rating.FIVE);
        courseRepository.save(course2);

        Course course3 = new Course("Ruby", "Inverness", Rating.THREE);
        courseRepository.save(course3);

        Booking booking1 = new Booking("May 2020", customer1, course1);
        bookingRepository.save(booking1);

//        customer1.addBooking(booking1);
//        customerRepository.save(customer1);
//        course1.addBooking(booking1);
//        courseRepository.save(course1);

        Booking booking2 = new Booking("September 2020", customer2, course2);
        bookingRepository.save(booking2);

        Booking booking3 = new Booking("September 2020", customer1, course2);
        bookingRepository.save(booking3);

        Booking booking4 = new Booking("June 2020", customer3, course3);
        bookingRepository.save(booking4);

        Booking booking5 = new Booking("April 2020", customer2, course3);
        bookingRepository.save(booking5);

        Booking booking6 = new Booking("May 2020", customer3, course1);
        bookingRepository.save(booking6);

    }
}
