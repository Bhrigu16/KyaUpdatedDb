package com.kya.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kya.model.SubActivity;

@Repository
public interface SubActivityRepository extends JpaRepository<SubActivity, Integer>{

}
