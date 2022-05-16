package n1ejercicio6;

public class Main {
	
	public static void main(String[]args) {
		
		Rana frog = new Rana();
		frog.mover();
		frog.comer();
		frog.respirar();
		frog.saltar();
		frog.mover(2);
		frog.comer(3);
		frog.respirar(4);
		
		Anfibio sapo = new Anfibio();
		sapo.comer();
		sapo.mover();
		sapo.respirar();
		//sapo.saltar(); no se puede aplicar porque no hereda la funcion.
 		
	}
	
}
