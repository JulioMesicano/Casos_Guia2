package com.senati.eti;

import java.util.Scanner;

public class Caso4v1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Ingresar el primer numero.........: ");
		int n1 = sc.nextInt();
		
		System.out.print("Ingresar el segundo numero........: ");
		int n2 = sc.nextInt();
		
		
        String mensaje = "";
		
		if( n1==n2)
		  mensaje="Los numeros son iguales";
		else if(n1 < n2)
		  mensaje="El primer numero " + n1 + "  es menor";
		else
	      mensaje ="El segundo numero "+ n2 + " es menor";
		
		System.out.println("\n----------Resultados---------");
		System.out.println("Mensaje : "+ mensaje);
	}

}
