package com.tslp.dca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tslp.dca.models.Cart;



@Repository
public interface CartRepository extends JpaRepository<Cart, Integer> {

}