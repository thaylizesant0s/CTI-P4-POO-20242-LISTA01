package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double sal, salreceber, grat, imp;
		
		System.out.print("Digite o sal�rio de um funcionario: ");
		sal = sc.nextDouble();
		
		grat = sal * 5/100;
        imp = sal * 7/100;
        salreceber = sal + grat - imp;
        
        System.out.print("O sal�rio final com a gratifica��o e com o imposto � igual a: " + salreceber);

	}

}
