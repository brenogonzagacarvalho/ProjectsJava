package br.ufc.quixada.si.model;

public class Place {
	
	private int id;
	private Host owner;
	private String type;
	private Address address;
	private double rating;
	
	public Place () {
		
	}

	public Place(int id, Host owner, String type, Address address, double rating) {
		super();
		this.id = id;
		this.owner = owner;
		this.type = type;
		this.address = address;
		this.rating = rating;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Host getOwner() {
		return owner;
	}

	public void setOwner(Host owner) {
		this.owner = owner;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}
	
}
