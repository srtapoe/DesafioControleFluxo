package br.com.exceptions;

public class ParametrosInvalidosException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ParametrosInvalidosException() {
		super("O primeiro numero nao pode ser maior que o segundo.");
	}
	
	
}
