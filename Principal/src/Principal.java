import java.util.*;

//nombre de la clase
public class Principal {

	// metodo principal
	public static void main(String[] args) {

		System.out.println(contarPalabras());
	}

	public static String contarPalabras() {
		System.out.println("ingrese la palabra");
		// clase que permite capturar datos por consola
		Scanner sc = new Scanner(System.in);

		String prueba = sc.next();
		return "la cantidad de letras que tiene la palabra es : ".concat(prueba.toUpperCase());


	}

}
