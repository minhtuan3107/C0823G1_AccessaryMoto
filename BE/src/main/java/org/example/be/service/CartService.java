package org.example.be.service;

import org.example.be.model.Cart;
import org.example.be.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CartService implements ICartService{
    @Autowired
    private CartRepository cartRepository;
    @Override
    public List<Cart> getListByIdAccount(Long id) {
        return cartRepository.getListByAccountId(id);
    }

    @Override
    public Long getTotalAmount(Long id) {
        return cartRepository.getTotalAmount(id);
    }
}
