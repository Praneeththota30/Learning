package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Ticket;
import com.example.demo.service.TicketBookingService;

@RestController
@RequestMapping(value="/api/tickets")
public class TicketController {

	@Autowired
	
	private TicketBookingService ticketBookingService;
	
	@PostMapping(value="/create")
	public Ticket createTicket(Ticket ticket) {
		return ticketBookingService.createTicket(ticket);
	}
	
	@GetMapping(value="ticket/{ticketID}")
	public Optional<Ticket> getTicketByID(@PathVariable("ticketID")Integer ticketID) {
		return ticketBookingService.getTicketByID(ticketID);
	}
}
