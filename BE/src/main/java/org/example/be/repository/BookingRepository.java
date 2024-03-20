package org.example.be.repository;

import org.example.be.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
    @Query(value = "select * from booking where booking.account_id = :id limit 20", nativeQuery = true)
    List<Booking> getListBookingByIdAccount(@Param("id") Long id);
}
