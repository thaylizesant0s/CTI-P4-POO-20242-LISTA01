package edu.br.principal;

import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num, i, f, a;
		
		System.out.print("Digite um n�mero real: ");
        num = sc.nextDouble();
        
        i = Math.floor(num);
        f = num - i;
        a = Math.floor(num + 0.5);
        
        System.out.println("Parte inteira: " + i);
        System.out.println("Parte fracion�ria: " + f);
        System.out.println("N�mero arredondado: " + a);
        
	}

}