package com.tslp.dca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tslp.dca.models.CartProduct;



@Repository
public interface CartProductRepository extends JpaRepository<CartProduct, Integer> {

}