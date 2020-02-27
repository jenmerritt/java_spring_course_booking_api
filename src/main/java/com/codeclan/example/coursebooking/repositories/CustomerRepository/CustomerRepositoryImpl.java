package com.codeclan.example.coursebooking.repositories.CustomerRepository;

import com.codeclan.example.coursebooking.models.Customer;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepositoryCustom {

    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Customer> getCustomersForCourse(String title){
        List<Customer> results = null;
        Session session = entityManager.unwrap(Session.class);
        Criteria cr = session.createCriteria(Customer.class);
        cr.createAlias("bookings", "bookingAlias");
        cr.createAlias("bookingAlias.course", "courseAlias");
        cr.add(Restrictions.eq("courseAlias.title", title));
        results = cr.list();
        return results;
    }

    @Transactional
    public List<Customer> getCustomersInTownForCourse(String town, String course){
        List<Customer> results = null;
        Session session = entityManager.unwrap(Session.class);
        Criteria cr = session.createCriteria(Customer.class);
        cr.createAlias("bookings", "bookingAlias");
        cr.createAlias("bookingAlias.course", "courseAlias");
        cr.add(Restrictions.eq("courseAlias.title", course));
        cr.add(Restrictions.eq("town", town));
        results = cr.list();
        return results;
    }

}
