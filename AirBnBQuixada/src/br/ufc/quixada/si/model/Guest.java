package br.ufc.quixada.si.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Guest extends User{
	
	private double rating;
	private ArrayList<Trip> trips;
	private ArrayList<Message> messages;
	
	public Guest () {
		
	}
	
	public Guest(int id, String firstName, String lastName, String cpf, String gender, LocalDate birthday, String email,
			String password, Address address, double rating, ArrayList<Trip> trips, ArrayList<Message> messages) {
		super(id, firstName, lastName, cpf, gender, birthday, email, password, address);
		this.rating = rating;
		this.trips = trips;
		this.messages = messages;
	}
	
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public ArrayList<Trip> getTrips() {
		return trips;
	}
	public void setTrips(ArrayList<Trip> trips) {
		this.trips = trips;
	}
	public ArrayList<Message> getMessages() {
		return messages;
	}
	public void setMessages(ArrayList<Message> messages) {
		this.messages = messages;
	}
	
}
