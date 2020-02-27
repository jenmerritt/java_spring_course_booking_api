package com.codeclan.example.coursebooking.repositories.BookingRepository;

import com.codeclan.example.coursebooking.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long>, BookingRepositoryCustom {
}
