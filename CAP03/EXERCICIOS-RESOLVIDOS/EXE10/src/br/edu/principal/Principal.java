package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double area , raio;
		
		System.out.print("Digite um raio: ");
		raio = sc.nextDouble();
		
		area = 3.1415 * raio * raio;
		
		System.out.print("A área do circulo é igual a: " + area);

	}

}
