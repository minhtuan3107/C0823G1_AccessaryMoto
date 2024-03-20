package org.example.be.repository;

import org.example.be.model.Cart;
import org.example.be.model.MotobikeAccessory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {

    @Query(value = "select * from cart\n" +
            "where cart.account_id = :id ", nativeQuery = true)
    List<Cart> getListByAccountId(@Param("id") Long id);

    @Query(value = "select sum(motobike_accessory.price) from cart\n" +
            "join motobike_accessory on cart.motobike_accessory_id = motobike_accessory.id\n" +
            "where cart.account_id = :id ", nativeQuery = true)
    Long getTotalAmount(@Param("id") Long id);
}
