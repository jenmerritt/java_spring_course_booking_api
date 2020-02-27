package com.codeclan.example.coursebooking.repositories.CourseRepository;

import com.codeclan.example.coursebooking.enums.Rating;
import com.codeclan.example.coursebooking.models.Course;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

public class CourseRepositoryImpl implements CourseRepositoryCustom {

    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Course> getAllCoursesByRating(Rating rating){
        List<Course> results = null;
        Session session = entityManager.unwrap(Session.class);
        Criteria cr = session.createCriteria(Course.class);
        cr.add(Restrictions.eq("rating", rating));
        results = cr.list();
        return results;
    }

}
