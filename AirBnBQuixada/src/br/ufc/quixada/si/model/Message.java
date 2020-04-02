package br.ufc.quixada.si.model;

import java.time.LocalDate;

public class Message {
	
	private int id;
	private User sender;
	private User receiver;
	private LocalDate sendDate;
	private String message;
	
	public Message() {
		
	}

	public Message(int id, User sender, User receiver, LocalDate sendDate, String message) {
		super();
		this.id = id;
		this.sender = sender;
		this.receiver = receiver;
		this.sendDate = sendDate;
		this.message = message;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getSender() {
		return sender;
	}

	public void setSender(User sender) {
		this.sender = sender;
	}

	public User getReceiver() {
		return receiver;
	}

	public void setReceiver(User receiver) {
		this.receiver = receiver;
	}

	public LocalDate getSendDate() {
		return sendDate;
	}

	public void setSendDate(LocalDate sendDate) {
		this.sendDate = sendDate;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
