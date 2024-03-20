package org.example.be.service;

import org.example.be.model.Booking;
import org.example.be.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService implements IBookingService {
    @Autowired
    private BookingRepository bookingRepository;

    @Override
    public List<Booking> getListByIdAccount(Long id) {
        return bookingRepository.getListBookingByIdAccount(id);
    }
}
