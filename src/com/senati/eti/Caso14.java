package com.senati.eti;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso14 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        
		
		System.out.print("Ingrese nombre del alumno......: ");
		String alumno = sc.nextLine();
		
		System.out.print("Ingrese la carrera [DS / RC /DG]............: ");
		String c = sc.nextLine();
		
		System.out.print("Ingrese horario [M / T / N]..............: ");
		String h=sc.nextLine();
		
		float monto =0;
		String carrera = "";
		
		if (c.equals("DS")) {
			carrera = "Desarrollo de software";
			monto=1500;}
		
		else if (c.equals("RC")) {
			carrera = "Redes y conectividad ";
			monto=1400;}
		
		else if (c.equals("DG")) {
			carrera = "Diseño Grafico";
			monto=1300;}
		
		
		float dscnto = 0;
		String turno = "";
		
		if (h.equals("M")) {
			turno="Mañana";
			dscnto=monto*0.10f;}
			
		else if (h.equals("T")) {
			turno="Tarde";
			dscnto=monto*0.20f;}
			
		else if(h.equals("N")) {
		 turno="Noche";
		 dscnto=monto*0.15f;}	
		 
		float total = monto-dscnto;
		float dolar = total/3.33f;
		
		 System.out.println("\n--------R E S U L T A D O S----------");	
		 System.out.println("Nombre..........................:"+alumno.toUpperCase());
		 System.out.println("La carrera seleccionada es......: "+carrera.toUpperCase());
		 System.out.println("El monto segun la carrera es....: "+monto);
		 System.out.println("El descuento es.................: "+df.format(dscnto));
		 System.out.println("Ha seleccionado el turno........: "+turno);
		 System.out.println("El total es.....................: "+total);
		 System.out.println("El Equivalente del total en dolares es.........: "+df.format(dolar));

	
	}

}
