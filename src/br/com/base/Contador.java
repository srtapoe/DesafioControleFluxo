package br.com.base;

import java.util.Scanner;

import br.com.exceptions.NumerosIguaisException;
import br.com.exceptions.ParametrosInvalidosException;

public class Contador {
	
	public static void main(String[] args) throws ParametrosInvalidosException, NumerosIguaisException {
		try (Scanner dadosEntrada = new Scanner(System.in)) {
			System.out.println("Digite o primeiro número: ");
			int primeiroNumero = dadosEntrada.nextInt();
			System.out.println("Digite o segundo número: ");
			int segundoNumero = dadosEntrada.nextInt();
			
			try {
				contar(primeiroNumero, segundoNumero);	
			}catch(ParametrosInvalidosException | NumerosIguaisException ex) {
				ex.printStackTrace();
			}
		}
		
		
	}
	
	static void contar(int primeiroNumero, int segundoNumero) throws ParametrosInvalidosException, NumerosIguaisException {
				if(primeiroNumero > segundoNumero) {
					throw new ParametrosInvalidosException();
				}else if(primeiroNumero == segundoNumero) {
					throw new NumerosIguaisException();
				}else {
					int contador = segundoNumero - primeiroNumero;
					for(int i = 0; i<= contador; i++) {
						System.out.println("Imprimindo..." + i);
					}
				}	
	}

}
