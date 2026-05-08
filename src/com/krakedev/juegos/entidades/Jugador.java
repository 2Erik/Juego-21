package com.krakedev.juegos.entidades;

import java.util.ArrayList;

public class Jugador {
	private String nickname;
	private ArrayList<Carta> cartas = new ArrayList<Carta>();
	
	public Jugador(String nickName) {
		this.nickname = nickName;
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
}
