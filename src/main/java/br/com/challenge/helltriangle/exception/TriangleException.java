package br.com.challenge.helltriangle.exception;

public class TriangleException extends Exception {

	private static final long serialVersionUID = 892350812789476276L;
	
	private String message;
	
	public TriangleException(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return this.message;
	}
	
}
