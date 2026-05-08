package com.krakedev.juegos.test;

import java.util.ArrayList;

import com.krakedev.juegos.entidades.Jugador;
import com.krakedev.juegos.servicios.Juego21;

public class TestJuego21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Juego21 juego21 = new Juego21();

		Jugador j1 = new Jugador("aaa");
		Jugador j2 = new Jugador("bbb");
		Jugador j3 = new Jugador("ccc");

		juego21.agregarJugador(j1);
		juego21.agregarJugador(j2);
		juego21.agregarJugador(j3);

		for (int i = 1; i <= 10; i++) {

			System.out.println("PARTIDA " + i);

			juego21.inicializar();

			ArrayList<Jugador> ganadores = juego21.jugar();

			// IMPRIMIR CARTAS DE CADA JUGADOR
			j1.imprimir();
			j2.imprimir();
			j3.imprimir();

			// IMPRIMIR GANADORES
			if (ganadores.isEmpty()) {
				System.out.println("NO HUBO GANADORES");
			} else {
				System.out.println("GANADORES:");
				for (Jugador j : ganadores) {
					System.out.println(j.getNickname());
				}
			}

			juego21.reiniciarJuego();
			System.out.println("-------------------------");
		}

	}

}
