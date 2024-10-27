package Ejercicio3;

public class Atraccion {
	private int duracion;
	private String calificacion;
	private int capacidad;
	private boolean requisito;
	private Cliente cliente;
	
	public Atraccion(int duracion, String calificacion, int capacidad, boolean requisito, Cliente cliente) {
		super();
		this.duracion = duracion;
		this.calificacion = calificacion;
		this.capacidad = capacidad;
		this.requisito = requisito;
		this.cliente = cliente;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public String getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(String calificacion) {
		this.calificacion = calificacion;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public boolean isRequisito() {
		return requisito;
	}

	public void setRequisito(boolean requisito) {
		this.requisito = requisito;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public void verificarRequisitos() {
		
	}
	
}
