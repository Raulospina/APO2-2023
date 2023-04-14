package Puntotres;

public class Animal {

	int weight, height;
	double speed;
	Animal() {
	weight = 50;
	height = 4;
	speed = 2;
	}
	Animal(int w, int h, int s ) {
	weight = w;
	h = height;
	speed = s;
	}
	public double getTime(double miles) { 
	return miles/speed;
	}
	public int getWeight() {
	return weight;
	}
	public int getHeight() {
	return height;
	}
	public double getSpeed() {
	return speed;
	}
	public static void main(String[] args) {
     Animal animal1 = new Animal();
     Animal animal2 = new Animal(20,12,4);
     
     System.out.println("la velocidad del animal 1 es:  "  + animal1.getSpeed());
     System.out.println("la velocidad del animal 2 es:  "  + animal2.getSpeed());
	}
	}
