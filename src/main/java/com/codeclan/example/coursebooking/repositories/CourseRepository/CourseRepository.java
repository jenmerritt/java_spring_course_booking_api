package com.codeclan.example.coursebooking.repositories.CourseRepository;

import com.codeclan.example.coursebooking.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long>, CourseRepositoryCustom {
}
