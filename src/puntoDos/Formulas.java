package puntoDos;

import java.util.Scanner;

public class Formulas {

	public void formulaA() {

		Scanner entrada = new Scanner(System.in);
		double respuesta = 0;
		double a = 0;
		double x = 0;
		System.out.print("\n ingrese x de la formula A \n ");
		x = entrada.nextInt();

		double exponente = Math.pow(x, 5);
		x = exponente - 6;
		double raiz = Math.sqrt(x);
		a = raiz / 4;
		respuesta = a;
		System.out.print("el valor de la formula A es \n" + a);

	}

	public void formulaB() {

		Scanner entrada = new Scanner(System.in);

		double respuesta = 0;
		double x = 0;
		double y = 0;

		System.out.print("\n ingrese x de la formula B \n ");
		x = entrada.nextInt();
		System.out.print(" \n  ingrese y de la formula B  \n ");
		y = entrada.nextInt();

		double exponenteUno = Math.pow(x, y);
		double exponenteDos = Math.pow(6, x);

		respuesta = exponenteUno - exponenteDos;
		System.out.print("el valor de la formula b es \n" + respuesta);
	}

	public void formulaC() {
		Scanner entrada = new Scanner(System.in);

		double z = 0;
		double x = 0;
		double respuesta = 0;
		System.out.print("\n ingrese z de la formula C \n ");
		z = entrada.nextInt();
		System.out.print("\n ingrese x de la formula C \n ");
		x = entrada.nextInt();

		double exponenteUno = z / 5;
		double exponenteDos = Math.cos(exponenteUno);
		double exponenteTres = (4 * exponenteDos);

		double exponenteCuatro = Math.sin(x);
		double exponenteCinco = Math.pow(exponenteCuatro, 2);

		respuesta = exponenteCinco - exponenteTres;

		System.out.print("el valor de la formula c es \n" + respuesta);

	}

	public void formulaD() {
		Scanner entrada = new Scanner(System.in);

		double respuesta = 0;
		double x = 0;
		double y = 0;

		System.out.print("\n ingrese x de la formula D \n ");
		x = entrada.nextInt();
		System.out.print(" \n  ingrese y de la formula D \n ");
		y = entrada.nextInt();

		double exponenteUno = Math.pow(x, 4);
		double exponenteDos = Math.pow(y, 3);
		double exponenteTres = (6 * x - y);
		double exponenteCuatro = Math.sqrt(exponenteTres);
		respuesta = exponenteUno - exponenteCuatro;

		System.out.print("el valor de la formula d es \n" + respuesta);

	}

	public void formulaE() {
		Scanner entrada = new Scanner(System.in);

		double respuesta = 0;
		double x = 0;
		double y = 0;

		System.out.print("\n ingrese x de la formula E \n ");
		x = entrada.nextInt();
		System.out.print(" \n  ingrese y de la formula E  \n ");
		y = entrada.nextInt();

		double exponenteUno = Math.pow(2, y);
		double exponenteDos = exponenteUno - x;
		double exponenteTres = (y * exponenteDos + 1);
		double exponenteCuatro = (exponenteDos / exponenteTres);

		respuesta = exponenteCuatro;
		System.out.print("el valor de la formula E es  \n" + respuesta);

	}

	public void formulaF() {

		Scanner entrada = new Scanner(System.in);
		double respuesta = 0;
		double a = 0;
		double x = 0;
		System.out.print("\n ingrese x de la formula F \n ");
		x = entrada.nextInt();

	}
}