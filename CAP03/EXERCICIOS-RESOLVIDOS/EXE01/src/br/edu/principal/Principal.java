package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2, n3, n4, soma;
		
		System.out.print("Digite o 1� n�mero: ");
		n1 = sc.nextInt();
		System.out.print("Digite o 2� n�mero: ");
		n2 = sc.nextInt();
		System.out.print("Digite o 3� n�mero: ");
		n3 = sc.nextInt();
		System.out.print("Digite o 4� n�mero: ");
		n4 = sc.nextInt();
		
		soma = n1 + n2 + n3 + n4;
		
		System.out.print("A soma dos n�meros �: " + soma);
	
	}

}