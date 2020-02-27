package com.codeclan.example.coursebooking.repositories.CourseRepository;

import com.codeclan.example.coursebooking.enums.Rating;
import com.codeclan.example.coursebooking.models.Course;

import java.util.List;

public interface CourseRepositoryCustom {

    List<Course> getAllCoursesByRating(Rating rating);
}
