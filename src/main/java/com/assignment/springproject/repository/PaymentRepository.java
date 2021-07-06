package com.assignment.springproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignment.springproject.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, String> {

}
