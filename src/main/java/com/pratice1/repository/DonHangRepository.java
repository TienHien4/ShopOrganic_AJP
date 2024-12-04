package com.pratice1.repository;

import com.practice1.entities.DonHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;


public interface DonHangRepository extends CrudRepository<DonHang, Integer>, JpaRepository<DonHang, Integer> {

}
