package org.example.be.controller;

import org.example.be.model.Booking;
import org.example.be.service.IBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/booking")
public class BookingRestController {
    @Autowired
    private IBookingService bookingService;

    @GetMapping("{id}")
    private ResponseEntity<List<Booking>> getListBookingByAccount(@PathVariable Long id) {
        List<Booking> getListBooking = bookingService.getListByIdAccount(id);
        return new ResponseEntity<>(getListBooking, HttpStatus.OK);
    }
}
