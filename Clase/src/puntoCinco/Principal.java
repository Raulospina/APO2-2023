package puntoCinco;
public class Principal {

	public static void main(String[] args) {
		// crear un objetp de tipo studen con la siguiente sintaxis
		// primero coloco el tipo de dato del objeto, despues el nombre del objeto
		// luego el signo igual, despues de la palabra new y por ultimo el constructor
		// de la clase

		Student st = new Student ();
		System.out.println(st.name + "\n" + st.Documento + "\n" + st.status);
	}
}
