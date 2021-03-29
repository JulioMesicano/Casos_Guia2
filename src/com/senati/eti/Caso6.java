package com.senati.eti;

import java.util.Scanner;

public class Caso6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese su sueldo..............:");
		float sueldo = sc.nextFloat();
		
		float calculo = 0;
		
		if (sueldo >2800)
           calculo=sueldo *0.05f;
		else
			calculo=sueldo* 0.02f;
		
		System.out.println("\n------------Resultados-----------");
		System.out.println("Sueldo ingresado.........:"+sueldo);
		System.out.println("Impuesto calculado.......:"+calculo);

	}

}
