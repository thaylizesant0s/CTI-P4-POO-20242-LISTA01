package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double nota1, nota2, nota3, media;
		int peso1, peso2, peso3;
		
		System.out.print("Digite a 1� nota: ");
		nota1 = sc.nextDouble();
		System.out.print("Digite o peso da 1� nota: ");
		peso1 = sc.nextInt();
		System.out.print("Digite a 2� nota: ");
		nota2 = sc.nextDouble();
		System.out.print("Digite o peso da 2� nota: ");
		peso2 = sc.nextInt();
		System.out.print("Digite a 3� nota: ");
		nota3 = sc.nextDouble();
		System.out.print("Digite o peso da 3� nota: ");
		peso3 = sc.nextInt();
		
		media = (nota1*peso1 + nota2*peso2 + nota3*peso3) / (peso1 + peso2 + peso3);
		
		System.out.print("A m�dia ponderada �: " + media);
	
	}

}