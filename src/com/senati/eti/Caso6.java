package com.senati.eti;

import java.util.Scanner;

public class Caso6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese su sueldo..............:");
		float sueldo = sc.nextFloat();
		
		String calculo = "";
		
		if (sueldo >2800)
           calculo=("" + sueldo *0.05);
		else
			calculo=("" +sueldo* 0.02);
		
		System.out.println("\n------------Resultados-----------");
		System.out.println("Sueldo ingresado.........:"+sueldo);
		System.out.println("Impuesto calculado.......:"+calculo);

	}

}
