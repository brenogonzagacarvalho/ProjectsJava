package br.ufc.quixada.si.model;

public class Address {
	
	private int id;
	private int number;
	private String street;
	private String city;
	private String state;
	private String zipCode;
	private String country;
	
	public Address() {
		
	}

	public Address(int id, int number, String street, String city, String state, String zipCode, String country) {
		super();
		this.id = id;
		this.number = number;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.country = country;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
}
