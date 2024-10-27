package Ejercicio1;

import javax.swing.JOptionPane;

public class Vehiculo {
	
	private int ruedas;
	private String marca;
	private String modelo;
	private boolean estado;
	private boolean motor;
	private boolean aceite;
	private Duenio duenio;
	
	public Vehiculo(int ruedas, String marca, String modelo, boolean estado, boolean motor, boolean aceite,
			Duenio duenio) {
		super();
		this.ruedas = ruedas;
		this.marca = marca;
		this.modelo = modelo;
		this.estado = estado;
		this.motor = motor;
		this.aceite = aceite;
		this.duenio = duenio;
	}
	
	public boolean isMotor() {
		return motor;
	}

	public void setMotor(boolean motor) {
		this.motor = motor;
	}

	public boolean isAceite() {
		return aceite;
	}

	public void setAceite(boolean aceite) {
		this.aceite = aceite;
	}

	public int getRuedas() {
		return ruedas;
	}

	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
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

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public Duenio getDuenio() {
		return duenio;
	}

	public void setDuenio(Duenio duenio) {
		this.duenio = duenio;
	}
	
	public void asignarDuenio(Duenio duenio) {
		
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
