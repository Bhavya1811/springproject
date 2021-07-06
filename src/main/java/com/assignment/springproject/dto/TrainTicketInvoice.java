package com.assignment.springproject.dto;

import com.assignment.springproject.entity.Passenger;

import lombok.Data;

@Data
public class TrainTicketInvoice {

	private String status;
	private double totalPrice;
	private String pnrNo;
	private Passenger passenger;

	public TrainTicketInvoice() {
		super();
	}

	public TrainTicketInvoice(String status, double totalPrice, String pnrNo, Passenger passenger) {
		super();
		this.status = status;
		this.totalPrice = totalPrice;
		this.pnrNo = pnrNo;
		this.passenger = passenger;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getPnrNo() {
		return pnrNo;
	}

	public void setPnrNo(String pnrNo) {
		this.pnrNo = pnrNo;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

}
