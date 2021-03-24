package com.senati.eti;

import java.util.Scanner;
public class Caso4v2 {

	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
		
	    System.out.print("Ingrese el primer numero..........: ");
	    int n1 = sc.nextInt();
	    
	    System.out.print("Ingrese el segundo numero.........: ");
	    int n2 = sc.nextInt();
	    
	    System.out.print("Ingrese el tercer numero.........: ");
	    int n3 = sc.nextInt();
	    
	    String mensaje = "";
	    
	    if (n1==n2 && n1==n3)
	      mensaje= "Los tres numeros son iguales";
	    
	    //Se le agrego esto si dos numeros eran iguales
	    else if (n1==n2||n2==n3) 
	      mensaje="Hay dos numeros iguales";
	    
	    else if (n1<n2 && n1<n3 )
	      mensaje = "El primer numero " + n1 + " es menor";
	    
	    else if (n2<n1 && n2<n3 )
		  mensaje = "El segundo numero " + n2 + " es menor";
	    
	    else
	      mensaje= "El tercer numero " + n3 + " es menor ";
	    
	    System.out.println("\n---------RESULTADOS-------");
	    System.out.println("Mensaje : " + mensaje);
	    

	}

}
