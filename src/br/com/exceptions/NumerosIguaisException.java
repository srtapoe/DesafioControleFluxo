package br.com.exceptions;

public class NumerosIguaisException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NumerosIguaisException() {
		super("Os n�meros n�o podem ser iguais");
	}
}
