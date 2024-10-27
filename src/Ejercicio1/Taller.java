package Ejercicio1;

import javax.swing.JOptionPane;

public class Taller {
	
	private String nombre;
	private String ubicacion;
	private Mecanico mecanico;
	private Vehiculo vehiculo;
	private double precio;
	
	

	public Taller() {
		super();
		this.nombre = "El Tano";
		this.ubicacion = "Av Corriente";
		this.mecanico = new Mecanico();
		this.vehiculo = null;
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
		return "";
	}
	
	public void verMenu() {
		String opciones [] = {"Asignar Mecanico","Ver Comprobante","Salir"};
		int elegido;
		do {
			elegido = JOptionPane.showOptionDialog(null, "Elija una Opcion", "Menu del Taller", 0, 0, null, opciones, opciones[0]);
			switch (elegido) {
			case 0:
				asignarMecanico();
				JOptionPane.showMessageDialog(null, "Se asigno al mecanico " + mecanico.getNombre() + " Al Vehiculo Modelo " + vehiculo.getModelo());
				break;
			case 1:
				if (mecanico.getNombre().equals("No asignado")) {
					JOptionPane.showMessageDialog(null, "Tiene que asignar un Mecanico Primero...");
				} else {
					verComprobante();
				}
				break;
			default:
				break;
			}
		} while (elegido!=2);
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
