package com.senati.eti;

import java.util.Scanner;

public class Caso4v3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese el primer numero...........:");
		int n1 = sc.nextInt();
		
		System.out.print("Ingrese el segundo numero..........:");
		int n2 = sc.nextInt();
		
		System.out.print("Ingrese el tercer numero...........:");
		int n3 = sc.nextInt();
		
		System.out.print("Ingrese el cuarto numero...........:");
		int n4 = sc.nextInt();
		
		String mensaje = "";
		
		if (n1==n2 && n1==n3 && n1==n4)
		 mensaje ="Los cuatro numeros son iguales";
		
		//Se le agrego esto si dos numeros eran iguales
	    else if (n1==n2|| n2==n3 || n3==n4) 
	      mensaje="Hay  numeros que son iguales";
		
		
		else if (n1 < n2 && n1 < n3 && n1 < n4)
		 mensaje = "El primer numero "+ n1 +" es el menor de todos";
		
		else if (n2 < n1 && n2 < n3 && n2 < n4)
			 mensaje = "El segundo numero "+ n2 +" es el menor de todos";
		
		else if (n3 < n1 && n3 < n2 && n3 < n4)
			 mensaje = "El tercer numero "+ n3 +" es el menor de todos";
		else
			 mensaje = " El cuarto numero "+n4 + " es el menor de todos ";
		
		
		System.out.println("\n----------------Resultados-------------");
		System.out.println("Mensaje : " +mensaje);
		
		
		
		
		
		
		
	}

}
