package n1ejercicio1;

public class Vehiculo {

	public Vehiculo() {
		System.out.println("constructor de vehiculo");
	}
	
	public void iniciar() {
		System.out.println("iniciar");
	}
	
	public static void main(String[]args) {
		Vehiculo v = new Vehiculo();
		v.iniciar();
		v.acelerar();
		v.parar();
	}
	
	public static void parar() {
		System.out.println("parar vehiculo");
	}
	
	public  void acelerar(){
		System.out.println("acelerar vehiculo");
	}
	
}
