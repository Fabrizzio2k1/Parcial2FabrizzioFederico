package Ejercicio1;

import java.time.LocalDate;

import javax.swing.JOptionPane;

public class Taller {
	
	private String nombre;
	private String ubicacion;
	private Mecanico mecanico;
	private Vehiculo vehiculo;
	private double precio;
	
	

	public Taller(Vehiculo vehiculo) {
		super();
		this.nombre = "El Tano";
		this.ubicacion = "Av Corriente";
		this.mecanico = new Mecanico(this);
		this.vehiculo = vehiculo;
		this.precio = 0;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
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
	
	public void asignarMecanico() {
		mecanico.setNombre(validarCaracter("Ingrese el nombre del Mecanico"));
	}
	
	public String verComprobante() {
		return "Se realizo la Verificacion del Vehiculo de: " + vehiculo.getDuenio().getNombre() +"\nTrabajo Realizado por el Mecanico/a: "+ mecanico.getNombre() +
				"\nMarca: " + vehiculo.getMarca() + "\nModelo: " + vehiculo.getModelo() + "\nPrecio Final: " + getPrecio() + " en la Fecha: " + LocalDate.now();
	}
	
	public void verMenu() {
		String opciones [] = {"Asignar Mecanico","Relizar Verificacion","Ver Comprobante","Salir"};
		int elegido;
		do {
			elegido = JOptionPane.showOptionDialog(null, "Elija una Opcion", "Menu del Taller", 0, 0, null, opciones, opciones[0]);
			switch (elegido) {
			case 0:
				asignarMecanico();
				break;
			case 1: 
				if (mecanico.getNombre().equals("No asignado")) {
					JOptionPane.showMessageDialog(null, "Tiene que asignar un Mecanico Primero...");
				} else {
					String resultadoVerificacion = mecanico.realizarVerificacion();
					JOptionPane.showMessageDialog(null, resultadoVerificacion);
				}
				break;
			case 2:
				if (vehiculo.isEstado()==false) {
					JOptionPane.showMessageDialog(null, "Tiene que Realizar Verificacion Primero...");
				} else {
					JOptionPane.showMessageDialog(null, verComprobante());
				}
				break;
			default:
				break;
			}
		} while (elegido!=3);
	}
	
	public String validarCaracter(String mensaje) {
		String texto = "";
		Boolean flag;
		do {
			flag = true;
			texto = JOptionPane.showInputDialog(mensaje);
			while (texto.isEmpty()) {
				texto = JOptionPane.showInputDialog(mensaje);
			}
			for (int i = 0; i < texto.length(); i++) {
				if(!Character.isAlphabetic(texto.charAt(i))) {
					flag = false;
					break;
				}
			}
		} while (!flag);
		
		return texto;
	}
}
