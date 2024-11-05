package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		double sal, novosal;
		
		System.out.print("Digite um salário: ");
		sal = sc.nextDouble();
		
		novosal = sal + sal * 25/100 ;
		
		System.out.print("O salário com o novo aumento de 25% é igual a: " + novosal);

	}

}
