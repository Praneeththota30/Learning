package com.example.demo.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "ticket")
public class Ticket {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "ticket_id")
	private Integer ticketID;
	
	@Column(name = "passenger_name")
	private String PassengerName;
	
	
	@Column(name = "source_station")
	private String SourceStation;
	
	@Column(name = "Dest_station")
	private String DestStation;
	
	@Column(name = "email")
	private String email;
	
	public Integer getTicketID() {
		return ticketID;
	}
	public void setTicketID(Integer ticketID) {
		this.ticketID = ticketID;
	}
	public String getPassengerName() {
		return PassengerName;
	}
	public void setPassengerName(String passengerName) {
		PassengerName = passengerName;
	}
	
	
	public String getSourceStation() {
		return SourceStation;
	}
	public void setSourceStation(String sourceStation) {
		SourceStation = sourceStation;
	}
	public String getDestStation() {
		return DestStation;
	}
	public void setDestStation(String destStation) {
		DestStation = destStation;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		email = email;
	}
	
}
