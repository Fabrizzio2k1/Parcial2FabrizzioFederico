package Ejercicio1;

public class Taller {
	
	private String nombre;
	private String ubicacion;
	private Mecanico mecanico;
	private double precio;
	
	public Taller(String nombre, String ubicacion, Mecanico mecanico, double precio) {
		super();
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.mecanico = mecanico;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public Mecanico getMecanico() {
		return mecanico;
	}

	public void setMecanico(Mecanico mecanico) {
		this.mecanico = mecanico;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public void asignarMecanico(Mecanico mecanico) {
		
	}
	
	public String verComprobante() {
		return "";
	}
}
