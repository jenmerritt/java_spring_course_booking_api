package com.codeclan.example.coursebooking.repositories.CourseRepository;

import com.codeclan.example.coursebooking.enums.Rating;
import com.codeclan.example.coursebooking.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long>, CourseRepositoryCustom {
    List<Course> findByRating(Rating rating);
    List<Course> findByBookingsCustomerName(String name);
    List<Course> getAllCoursesByRating(Rating rating);
}
