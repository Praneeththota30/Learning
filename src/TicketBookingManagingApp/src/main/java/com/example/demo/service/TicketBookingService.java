package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.TicketBookingDao;
import com.example.demo.entities.Ticket;
import java.util.Optional;

@Service
public class TicketBookingService {

	@Autowired
	private TicketBookingDao ticketBookingDao;
	
	public Ticket createTicket(Ticket ticket) {
		return  (ticketBookingDao).save(ticket);
	}

	public Optional<Ticket>  getTicketByID(Integer ticketID) {
		return (ticketBookingDao).findById(ticketID);
	}

	
}
