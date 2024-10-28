package Ejercicio3;

import javax.swing.JOptionPane;

public class Operador {
	private String nombre;
	private int legajo;
	private Parque parque;
	
	public Operador(Parque parque) {
		super();
		this.nombre = "No asignado";
		this.legajo = 0;
		this.parque = parque;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	public Parque getParque() {
		return parque;
	}

	public void setParque(Parque parque) {
		this.parque = parque;
	}

	public void verificarAcceso() {
		setLegajo(validarNumeroLegajo("Ingrese los 4 numeros de Legajo del Operador"));
		if (parque.getAtraccion().isRequisito()) {
			JOptionPane.showMessageDialog(null, getParque().getAtraccion().getCliente().getNombre() + " Esta apto para jugar");
		} else {
			JOptionPane.showMessageDialog(null, getParque().getAtraccion().getCliente().getNombre() + " No esta apto para jugar");
		}
	}
	
	public int validarNumeroLegajo(String mensaje) {
		boolean flag ;
		String num ="";
		do {
			flag =true;
			num = JOptionPane.showInputDialog(mensaje);
			while (num.isEmpty() || num.length() != 4) {
				num = JOptionPane.showInputDialog(mensaje);
			}
			for (int i = 0; i < num.length(); i++) {
				if (!Character.isDigit(num.charAt(i))) {
					flag = false;
					break;
				}
			}
		} while (!flag);
		
		return Integer.parseInt(num);
	}
	
}
