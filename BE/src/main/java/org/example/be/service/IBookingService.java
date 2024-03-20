package org.example.be.service;

import org.example.be.model.Booking;

import java.util.List;

public interface IBookingService {
    List<Booking> getListByIdAccount(Long id);
}
