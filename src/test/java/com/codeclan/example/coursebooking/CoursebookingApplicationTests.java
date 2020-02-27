package com.codeclan.example.coursebooking;

import com.codeclan.example.coursebooking.models.Course;
import com.codeclan.example.coursebooking.models.Customer;
import com.codeclan.example.coursebooking.repositories.BookingRepository.BookingRepository;
import com.codeclan.example.coursebooking.repositories.CourseRepository.CourseRepository;
import com.codeclan.example.coursebooking.repositories.CustomerRepository.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
class CoursebookingApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	CourseRepository courseRepository;

	@Autowired
	BookingRepository bookingRepository;

	@Test
	public void findByAgeGreaterThanAndTownAndBookingsCourseTitle(){
		List<Customer> found = customerRepository.findByAgeGreaterThanAndTownAndBookingsCourseTitle(40, "Livingston", "Java");
		assertEquals(1, found.size());
		assertEquals("Brian", found.get(0).getName());
	}

}
