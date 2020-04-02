package br.ufc.quixada.si.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Trip {
	
	private int id;
	private Address destination;
	private LocalDate departureDate;
	private LocalDate returnDate;
	private ArrayList<Guest> travelers;
	
	public Trip() {
		
	}

	public Trip(int id, Address destination, LocalDate departureDate, LocalDate returnDate,
			ArrayList<Guest> travelers) {
		super();
		this.id = id;
		this.destination = destination;
		this.departureDate = departureDate;
		this.returnDate = returnDate;
		this.travelers = travelers;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Address getDestination() {
		return destination;
	}

	public void setDestination(Address destination) {
		this.destination = destination;
	}

	public LocalDate getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(LocalDate departureDate) {
		this.departureDate = departureDate;
	}

	public LocalDate getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(LocalDate returnDate) {
		this.returnDate = returnDate;
	}

	public ArrayList<Guest> getTravelers() {
		return travelers;
	}

	public void setTravelers(ArrayList<Guest> travelers) {
		this.travelers = travelers;
	}
	
}
