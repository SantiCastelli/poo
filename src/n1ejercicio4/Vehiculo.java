package n1ejercicio4;

public class Vehiculo {
	public static final int estfinal=20;//constante de la clase, solo se pueden inicializar aqui.
	public final int solofinal; // constante del objeto, se inicializa aqui y en el constructor.
	public static int solostatic;// No tienen limitaciones
	
	public Vehiculo() {
		solofinal = 30;
		solostatic = 10;
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
