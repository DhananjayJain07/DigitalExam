package com.tslp.dca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tslp.dca.models.Category;



@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}