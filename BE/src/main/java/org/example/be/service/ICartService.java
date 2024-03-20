package org.example.be.service;

import org.example.be.model.Cart;

import java.util.List;

public interface ICartService {
    List<Cart> getListByIdAccount(Long id);

    Long getTotalAmount(Long id);
}
