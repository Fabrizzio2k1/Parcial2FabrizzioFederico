package Ejercicio3;

public class Cliente {
	private String nombre;
	private double altura;
	private int edad;
	
	public Cliente() {
		super();
		this.nombre = "No asignado";
		this.altura = 0;
		this.edad = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
}
