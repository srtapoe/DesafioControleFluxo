package br.com.exceptions;

public class NumerosIguaisException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NumerosIguaisException() {
		super("Os números não podem ser iguais");
	}
}
