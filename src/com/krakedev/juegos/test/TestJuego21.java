package com.krakedev.juegos.test;

import com.krakedev.juegos.entidades.Jugador;
import com.krakedev.juegos.servicios.Juego21;

public class TestJuego21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Juego21 juego21 = new Juego21();
		Jugador jugador1 = new Jugador("aaaa");
		Jugador jugador2 = new Jugador("ssss");
		Jugador jugador3 = new Jugador("dddd");
		
		
		juego21.agregarJugador(jugador3);
		juego21.agregarJugador(jugador2);
		juego21.agregarJugador(jugador1);
		
		juego21.inicializar();
		juego21.repartirRonda();
		
		jugador1.imprimir();
		jugador2.imprimir();
		jugador3.imprimir();
		
		System.out.println("----CARTAS");
		juego21.getDealer().imprimir();
	
	}

}
