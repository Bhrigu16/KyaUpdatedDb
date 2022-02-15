package com.kya.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kya.model.Activity;

@Repository
public interface ActivityRepository extends JpaRepository<Activity, Integer>{

}
