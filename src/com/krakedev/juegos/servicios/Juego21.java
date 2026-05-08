package com.krakedev.juegos.servicios;

import java.util.ArrayList;

import com.krakedev.juegos.entidades.Carta;
import com.krakedev.juegos.entidades.Jugador;

public class Juego21 {
	private ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
	private Dealer dealer ;
	
	//CARGAR VALORES
	public void cargarValores() {
		for(int i=0;i<dealer.getNaipe().size();i++) {
			Carta carta = dealer.getNaipe().get(i);
			
			if(carta.getValor().equals("A")) {
				carta.setValorJuego(11);
			}else if (carta.getValor().equals("J")||
					carta.getValor().equals("Q")||
					carta.getValor().equals("K")) {
				carta.setValorJuego(10);
			}else {
				carta.setValorJuego(Integer.parseInt(carta.getValor()));
			}
		}
	}
	
	//METODO INICIALIZAR
	public void inicializar() {
		dealer = new Dealer();
		cargarValores();
		
	}
	
	//METODO AGREGAR JUGADOR
	public void agregarJugador(Jugador jugador) {
		jugadores.add(jugador);
	}
	
	//MEODO REPARTIR
	public void repartirCarta(Jugador jugador) {
		Carta carta = dealer.entregarCarta();
		jugador.recibirCarta(carta);
	}
	
	//METODO REPARTIR RONDA
	public void repartirRonda() {
		for (Jugador j : jugadores) {
			repartirCarta(j);
		}
		calcularTotal();
	}
	
	//METODO CALCULAR TOTAL
	public void calcularTotal() {
		for (Jugador j : jugadores) {
			int suma = 0;
			ArrayList<Carta> cartas = j.getCartas();
			for (Carta c : cartas) {
				suma += c.getValorJuego();
			}
			j.setPuntajeCartas(suma);
		}
	}
	
	//METODO VALIDAR GANADOR
	public ArrayList<Jugador> validarGanador() {
		ArrayList<Jugador> ganadores = new ArrayList<Jugador>();
		for (Jugador jugador : jugadores) {
			if(jugador.getPuntajeCartas()==21) {
				ganadores.add(jugador);
			}
		}
		return ganadores;
	}
	
	//METODO JUGAR
	public ArrayList<Jugador> jugar() {

	    ArrayList<Jugador> ganadores = new ArrayList<Jugador>();
	    for (int i = 1; i <= 3; i++) {
	        repartirRonda();
	        ganadores = validarGanador();
	        if (ganadores.size() > 0) {
	            break;
	        }
	    }
	    return ganadores;
	}
	
	//METODO REINOICIAR JUEGO
	public void reiniciarJuego() {

	    for (Jugador j : jugadores) {
	        j.reiniciar();
	    }

	    dealer = new Dealer();
	    cargarValores();
	}

	//GETTERS AND SETTRES
	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(ArrayList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

	public Dealer getDealer() {
		return dealer;
	}

	public void setDealer(Dealer dealer) {
		this.dealer = dealer;
	}
	
	
}
