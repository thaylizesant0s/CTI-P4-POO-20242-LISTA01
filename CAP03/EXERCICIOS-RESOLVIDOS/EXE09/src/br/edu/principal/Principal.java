package br.edu.principal;

import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double base, altura, area;
		
		System.out.print("Digite a base do tri�ngulo: ");
		base = sc.nextDouble();
		System.out.print("Digite a altura do tri�ngulo: ");
		altura = sc.nextDouble();
		
		area = (base * altura) / 2;
		
		System.out.println("A �rea do tri�ngulo �: " + area);

	}

}