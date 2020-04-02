package br.ufc.quixada.si.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Host extends User{
	
	private double rating;
	private ArrayList<Place> places;
	
	
	public Host() {
		
	}

	public Host(int id, String firstName, String lastName, String cpf, String gender, LocalDate birthday, String email,
			String password, Address address, double rating, ArrayList<Place> places) {
		super(id, firstName, lastName, cpf, gender, birthday, email, password, address);
		this.rating = rating;
		this.places = places;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public ArrayList<Place> getPlaces() {
		return places;
	}

	public void setPlaces(ArrayList<Place> places) {
		this.places = places;
	}
	
}
