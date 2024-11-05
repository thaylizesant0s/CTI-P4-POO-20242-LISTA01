package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 double dep , taxa , rend , total;
		 
		 System.out.print("Digite o valor do depósito: ");
		 dep = sc.nextDouble();
		 System.out.print("Digite o valor da taxa de juros: ");
		 taxa = sc.nextDouble();
		 
		 rend = dep * taxa/100;
		 total = dep + rend;
		 
		 System.out.println("O valor do rendimento é igual a: " + rend);
		 System.out.print("O valor total do depósito com o rendimento é igual a: " + total);

	}

}
