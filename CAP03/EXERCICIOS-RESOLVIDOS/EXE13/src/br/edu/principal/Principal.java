package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double pes, polegadas, jardas, milhas;
		
		System.out.print("Digite o n�mero de p�s: ");
		pes = sc.nextDouble();
		
		polegadas = pes * 12;
		jardas = pes / 3;
		milhas = jardas / 1.760;
		
	    System.out.println("A convers�o para polegadas � igual a: " + polegadas);
	    System.out.println("A convers�o para jardas � igual a: " + jardas);
	    System.out.print("A convers�o para milhas � igual a: " + milhas);

	}

}
