package n2ejercicio3;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[]args) {
		Tricycle tri = new Tricycle();
		Bicycle bi = new Bicycle();
		Unicycle uni = new Unicycle();
		ride(tri);
		ride(bi);
		ride(uni);
		ArrayList<Cycle> lista = new ArrayList<Cycle>();
		lista.add(uni);
		lista.add(bi);
		lista.add(tri);
		for(Cycle c:lista) {
			if (c instanceof Unicycle)
				((Unicycle) c).balance();
			else if (c instanceof Bicycle)
				((Bicycle) c).balance();
		}
	}
	public static void ride(Cycle c) {
		System.out.println("El cyclo tiene " + c.wheels()+ " ruedas");
	}
}
