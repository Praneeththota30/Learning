package com.example.demo;






import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entities.Ticket;
import com.example.demo.service.TicketBookingService;

@SpringBootApplication
public class TicketBookingManagingAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(TicketBookingManagingAppApplication.class, args);
	    
		TicketBookingService ticketBookingService = applicationContext.getBean("ticketBookingService" , TicketBookingService.class);
	 
		Ticket ticket = new Ticket();
		ticket.setSourceStation("Mumbai");
		ticket.setDestStation("PUNE");
		ticket.setPassengerName("PT");
		ticket.setEmail("pt@gmail.com");
		
		
		ticketBookingService.createTicket(ticket);
	}

}
