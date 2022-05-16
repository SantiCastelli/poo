package poo;

public class Vehiculo {
	/*Atributos-propiedades --> Indicasn el estado del objeto
	 normalmente son privados
	 */
	protected String color;
	protected int caballos;
	protected String marca;
	protected String modelo;
	
	/*Metodos-Funciones
	 Normalmente son publicos

	 	- Constructor
	 	- Getters-setters
	 	- Resto
	 */
	//Constructor
	public Vehiculo() {
		this.marca="";
		this.modelo="";
	}
	
	

	



	//Getters-Setters
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCaballos() {
		return caballos;
	}

	public void setCaballos(int caballos) {
		this.caballos = caballos;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	
}
