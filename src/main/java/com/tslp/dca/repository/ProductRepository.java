package com.tslp.dca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tslp.dca.models.Product;



@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}