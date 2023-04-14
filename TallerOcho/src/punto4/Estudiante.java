package punto4;

public class Estudiante {
 
String nombre;
int credito,puntos_de_calidad;
double promedio;

public Estudiante() {

}

public Estudiante(String nombre, int puntos_de_calidad, int credito,int promedio) {
this.nombre =nombre;
this.puntos_de_calidad = puntos_de_calidad;
this.credito = credito;
this.promedio = promedio;

}	
public double getPromedio() { 
	return puntos_de_calidad/credito;
}
public static void main(String[] args) {
	Estudiante estudiante1 = new Estudiante("Mary",46,14, 0);
	Estudiante estudiante2 = new Estudiante("john",173,60,0);
	Estudiante estudiante3 = new Estudiante("ari",69,31,0);
    System.out.println("el promedio del estudiante 1 es:  "  + estudiante1.getPromedio());
    System.out.println("el promedio del estudiante 2 es:  "  + estudiante2.getPromedio());
    System.out.println("el promedio del estudiante 3 es:  "  + estudiante3.getPromedio());

}

}