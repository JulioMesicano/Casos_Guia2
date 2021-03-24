package com.senati.eti;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Ingrese primer numero......: ");
		float n1 =sc.nextFloat();
		
		System.out.print("Ingrese segundo numero.....: ");
		float n2 =sc.nextFloat();
		
		System.out.print("Ingrese Operacion [1-6] :...........: ");
		int op = sc.nextInt();
		
		String operacion = "";
		String res = "";
		
		switch (op) {
		   case 1 :
		      operacion = "Suma";
		      res="La suma es....... :"+(n1 + n2);
		      break;
		      
		   case 2 :
			  operacion = "Resta";
			  res ="La resta es..... :"+(n1-n2);
			  break;
		   case 3 :
			   operacion = "Producto";
			   res="El producto es....:"+(n1*n2);
			   break;
		   case 4 :
			   operacion = "Division";
			   if (n2==0)
				   res="No es posible dividir entre cero";
			   else
				   res="La divicion es......"+ df.format(n1/n2);
			   break;
		   case 5 :
			   operacion = "Resto";
			   if (n2==0)
				   res="No es posible hallar el resto entero";
			   else
				   res="El resto entero es........:"+ df.format(n1%n2);
			  break;
		   case 6 :
			   operacion ="Promedio";
			   res = "El promedio es..........:"+((n1+n2)/2);
			   break;
			   
		   default:
		       operacion = "Incorrecta ,solo elija una operacion del 1-6";
			   
		
		}
        System.out.println("\n----------------Resultado--------------");
		System.out.println("La operacion elegida es........"+operacion);
		System.out.println("" + res);
	}

}
