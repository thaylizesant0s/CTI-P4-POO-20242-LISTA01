package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1, num2, r1, r2;
		
		System.out.println("Digite o primeiro número: ");
		num1 = sc.nextDouble();
		System.out.print("Digite o segundo número: ");
		num2 = sc.nextDouble();
		
        r1 = Math.pow(num1, num2);
        r2 = Math.pow(num2, num1);

        System.out.println("O resultado de " + num1 + " elevado a " + num2 + " é: " + r1);
        System.out.println("O resultado de " + num2 + " elevado a " + num1 + " é: " + r2);

	}

}
