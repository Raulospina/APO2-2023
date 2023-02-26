package puntoUno;

import java.util.Scanner;

public class Triangulo {
	public void calcularTriangulo( ) {
	
		Scanner entrada = new Scanner (System.in);
		
		double base  = 0;
		double altura = 0;
		double a = 0;
		System.out.print("ingrese la base: \n ");
	    base  = entrada.nextInt();
		System.out.print("ingrese la altura: \n ");
	    altura  = entrada.nextInt();
		
		
		a= (base*altura)/2;
		System.out.print("la superficie es: \n " + a);
		
	}
	
	
	
}
