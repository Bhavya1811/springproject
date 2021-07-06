package com.assignment.springproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.springproject.dto.TrainTicketBooking;
import com.assignment.springproject.dto.TrainTicketInvoice;
import com.assignment.springproject.service.TrainBookingService;

@RestController
public class TicketController {

	@Autowired
	private TrainBookingService service;

	@PostMapping("/bookTrainTicket")
	public TrainTicketInvoice bookTrainTicket(@RequestBody TrainTicketBooking request) {
		return service.bookTrainTicket(request);
	}

}
