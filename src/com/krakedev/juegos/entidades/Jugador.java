package com.krakedev.juegos.entidades;

import java.util.ArrayList;

public class Jugador {
	private String nickname;
	private int puntajeCartas = 0;
	private ArrayList<Carta> cartas;
	
	public Jugador(String nickName) {
		this.nickname = nickName;
		cartas = new ArrayList<Carta>();
	}
	
	//METODO RECIBIR CARTA
	public void recibirCarta(Carta carta) {
		cartas.add(carta);
	}
	
	//METODO IMPRIMIR
	public void imprimir() {
		System.out.println("JUGADOR: "+nickname);
		for (Carta carta : cartas) {
			System.out.println("Valor: "+carta.getValor());
			System.out.println("Valor Juego: "+carta.getValorJuego());
			System.out.println("Palo: "+carta.getPalo());
		}
		System.out.println("---------------");
	}
	
	//METODO REINICIAR
	public void reiniciar() {
	    cartas.clear();
	    puntajeCartas = 0;
	}

	//GETTERD AND SETTERS
	public int getPuntajeCartas() {
		return puntajeCartas;
	}

	public void setPuntajeCartas(int puntajeCartas) {
		this.puntajeCartas = puntajeCartas;
	}

	public ArrayList<Carta> getCartas() {
		return cartas;
	}

	public void setCartas(ArrayList<Carta> cartas) {
		this.cartas = cartas;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	
}
