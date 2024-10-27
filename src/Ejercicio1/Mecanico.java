package Ejercicio1;

public class Mecanico {
	private String nombre;
	private Vehiculo vehiculo;
	
	public Mecanico(String nombre, Vehiculo vehiculo) {
		super();
		this.nombre = nombre;
		this.vehiculo = vehiculo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	
	public void realizarVerificacion(Vehiculo vehiculo) {
		
	}
}
