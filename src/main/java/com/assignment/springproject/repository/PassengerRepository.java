package com.assignment.springproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignment.springproject.entity.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
