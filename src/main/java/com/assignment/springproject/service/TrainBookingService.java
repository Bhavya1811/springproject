package com.assignment.springproject.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.assignment.springproject.dto.TrainTicketBooking;
import com.assignment.springproject.dto.TrainTicketInvoice;
import com.assignment.springproject.entity.Passenger;
import com.assignment.springproject.entity.Payment;
import com.assignment.springproject.repository.PassengerRepository;
import com.assignment.springproject.repository.PaymentRepository;
import com.assignment.springproject.utils.PaymentUtils;

@Service
public class TrainBookingService {

	@Autowired
	private PassengerRepository passengerRepository;
	@Autowired
	private PaymentRepository paymentRepository;

	@Transactional
	public TrainTicketInvoice bookTrainTicket(TrainTicketBooking request) {

		Passenger passenger = request.getPassenger();
		passenger = passengerRepository.save(passenger);

		Payment payment = request.getPayment();

		PaymentUtils.checkCreditLimit(payment.getAccountNo(), passenger.getPrice());

		payment.setPassengerId(passenger.getpId());
		payment.setAmount(passenger.getPrice());
		paymentRepository.save(payment);
		return new TrainTicketInvoice("SUCCESS", passenger.getPrice(), UUID.randomUUID().toString().split("-")[0],
				passenger);

	}

}
