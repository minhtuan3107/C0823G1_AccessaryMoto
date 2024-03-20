package org.example.be.controller;

import org.example.be.model.Cart;
import org.example.be.service.ICartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/cart")
public class CartRestController {
    @Autowired
    private ICartService cartService;

    @GetMapping("{id}")
    private ResponseEntity<List<Cart>> getListByAccountId(@PathVariable Long id) {
        List<Cart> carts = cartService.getListByIdAccount(id);
        return new ResponseEntity<>(carts, HttpStatus.OK);
    }
    @GetMapping("totalAmount/{id}")
    private ResponseEntity<Long>totalAmount(@PathVariable Long id){
        Long price = cartService.getTotalAmount(id);
        return new ResponseEntity<>(price,HttpStatus.OK);
    }
}
