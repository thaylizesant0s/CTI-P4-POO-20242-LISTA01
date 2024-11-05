package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double p_fab , perc_d , perc_i , vlr_d , vlr_i, p_final;
		
		System.out.println("Digite o valor do carro: ");
		p_fab = sc.nextDouble();
		System.out.println("Digite o percentual de lucro do distribuidor: ");
		perc_d = sc.nextDouble();
		System.out.print("Digite o percentual de imposto sobre o carro: ");
		perc_i = sc.nextDouble();
		
		vlr_d = p_fab * perc_d/100;
		vlr_i = p_fab * perc_i/100;
		p_final = p_fab + vlr_d + vlr_i;
		
		System.out.println("O valor correspondente ao lucro do distribuidor é igual a: " + vlr_d);
		System.out.println("O valor correspondente ao imposto sobre o carro é igual a: " + vlr_i);
		System.out.println("O preço final do carro é igual a: " + p_final);

	}

}
