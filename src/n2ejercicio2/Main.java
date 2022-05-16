package n2ejercicio2;

public class Main {
	
	public static void main(String[]args) {
		Tricycle tri = new Tricycle();
		Bicycle bi = new Bicycle();
		Unicycle uni = new Unicycle();
		ride(tri);
		ride(bi);
		ride(uni);
	}
	public static void ride(Cycle c) {
		System.out.println("El cyclo tiene " + c.wheels()+ " ruedas");
	}
}
