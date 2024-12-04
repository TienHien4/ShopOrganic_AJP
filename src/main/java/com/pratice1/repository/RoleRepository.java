package com.pratice1.repository;

import com.practice1.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

	Role findByroleName(String role);
}