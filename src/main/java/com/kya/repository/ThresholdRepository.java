package com.kya.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kya.model.ThresholdParameter;

@Repository
public interface ThresholdRepository extends JpaRepository<ThresholdParameter, Integer> {

}
