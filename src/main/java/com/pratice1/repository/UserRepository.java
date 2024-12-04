package com.pratice1.repository;

import com.practice1.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<Customer, Integer> {

	public boolean existsByUsername(String username);

	Customer findByUsername(String username);

}
