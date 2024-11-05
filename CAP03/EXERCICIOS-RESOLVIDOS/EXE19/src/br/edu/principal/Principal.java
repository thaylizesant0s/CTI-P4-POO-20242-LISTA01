package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a_degrau , a_usuario , qtd_degraus;
		
		System.out.print("Digite o valor da altura dos degraus: ");
		a_degrau = sc.nextDouble();
		System.out.print("Digite o valor da alura que deseja subir: ");
		a_usuario = sc.nextDouble();
		
		qtd_degraus = a_usuario / a_degrau;	
		
		System.out.print("A quantidade de degraus necessários para atingir a altura fornecida é igual a: " + qtd_degraus);

	}

}
