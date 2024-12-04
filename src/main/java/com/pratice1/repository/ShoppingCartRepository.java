package com.pratice1.repository;

import com.practice1.entities.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Long>{

}
