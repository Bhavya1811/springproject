package com.assignment.springproject.dto;

import com.assignment.springproject.entity.Passenger;
import com.assignment.springproject.entity.Payment;

import lombok.Data;

@Data
public class TrainTicketBooking {

	private Passenger passenger;

	private Payment payment;

	public TrainTicketBooking() {
		super();
	}

	public TrainTicketBooking(Passenger passenger, Payment payment) {
		super();
		this.passenger = passenger;
		this.payment = payment;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

}
