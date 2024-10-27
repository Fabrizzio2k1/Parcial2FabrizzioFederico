package Ejercicio3;

public class Parque {
	private String nombre;
	private String ubicacion;
	private Atraccion atraccion;
	private Operador operador;
	
	public Parque(String nombre, String ubicacion, Atraccion atraccion, Operador operador) {
		super();
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.atraccion = atraccion;
		this.operador = operador;
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

	public Atraccion getAtraccion() {
		return atraccion;
	}

	public void setAtraccion(Atraccion atraccion) {
		this.atraccion = atraccion;
	}

	public Operador getOperador() {
		return operador;
	}

	public void setOperador(Operador operador) {
		this.operador = operador;
	}
	
	public void asignarOperador() {
		
	}
	
}
