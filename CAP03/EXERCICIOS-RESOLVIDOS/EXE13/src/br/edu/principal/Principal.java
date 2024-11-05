package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double pes, polegadas, jardas, milhas;
		
		System.out.print("Digite o número de pés: ");
		pes = sc.nextDouble();
		
		polegadas = pes * 12;
		jardas = pes / 3;
		milhas = jardas / 1.760;
		
	    System.out.println("A conversão para polegadas é igual a: " + polegadas);
	    System.out.println("A conversão para jardas é igual a: " + jardas);
	    System.out.print("A conversão para milhas é igual a: " + milhas);

	}

}
