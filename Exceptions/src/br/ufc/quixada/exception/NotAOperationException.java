package br.ufc.quixada.exception;

public class NotAOperationException extends Exception {
	public NotAOperationException() {
		
	}
	public NotAOperationException(String message){
		super(message);
	}
}
