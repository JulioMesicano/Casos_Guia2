package com.senati.eti;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Ingrese nombre del empleado.........:");
		String nombre = sc.nextLine();
		
		System.out.print("Ingresar horas trabajadas............:");
		float ht = sc.nextFloat();
		
		System.out.print("Ingresar tarifa por hora............:");
		float th = sc.nextFloat();
		
		System.out.print("Ingresar numero de minutos de tardanza............:");
		float mt = sc.nextFloat();
		
		
		float importe = ht*th;
		float bono =0 ;
		float descuento = 0;
		
		
		if (ht>60)  
			bono= importe * 0.13f;
		else
		    bono =importe * 0.04f;	
		
		if (mt>15)
			descuento=importe*0.03f;
		
		float alcanzado = ht/70 * 100;
		
		System.out.println("\n---------R E S U L T A D O S-----------");
		System.out.println("\nEmpleado......................:" +nombre.toUpperCase());
		System.out.println("Horas trabajadas............:" +ht);
		System.out.println("Tarifa por hora.............:" +th);
		System.out.println("Importe.....................:" +df.format(importe));	
		System.out.println("Bono........................:" +df.format(bono));
		System.out.println("Descuento...................:" +df.format(descuento));
		System.out.println("Meta alcanzada..............:" +df.format(alcanzado) +"%");

	}

}
