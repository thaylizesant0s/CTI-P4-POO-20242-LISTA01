package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x , y , z;
		
		System.out.print("Digite o valor de Z: ");
	    z = sc.nextDouble();
	    System.out.print("Digite o valor de X: ");
	    x = sc.nextDouble();	        
	        
	    y = Math.pow(z, 2) - Math.pow(x, 2);
	    y = Math.sqrt(y); 
	        
	    System.out.print("O valor de Y é: " +  y);

	}

}
