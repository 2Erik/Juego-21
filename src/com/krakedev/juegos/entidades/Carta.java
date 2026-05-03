package com.krakedev.juegos.entidades;

public class Carta {
	
	private String valor;
	private int valorJuego;
	private String palo;
	
	//CONSTRUCTOR
	public Carta(String valor, int valorJuego, String palo) {
		this.valor = valor;
		this.valorJuego = valorJuego;
		this.palo = palo;
	}
	
	//GETTERS AND SETTERS
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public int getValorJuego() {
		return valorJuego;
	}
	public void setValorJuego(int valorJuego) {
		this.valorJuego = valorJuego;
	}
	public String getPalo() {
		return palo;
	}
	public void setPalo(String palo) {
		this.palo = palo;
	}
	
	//METODO IMPRIMIR
	public void imprimir() {
		String mensaje;
		mensaje = "Valor: "+valor
				+"\nValor Juego: "+valorJuego
				+"\nPalo: "+palo;
		System.out.println(mensaje);
	}
	
}
