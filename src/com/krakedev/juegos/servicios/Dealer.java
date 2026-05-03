package com.krakedev.juegos.servicios;

import java.util.ArrayList;

import com.krakedev.juegos.entidades.Carta;

public class Dealer {
	
	private ArrayList<Carta> naipe;
	
	//CONSTRUCTOR
	public Dealer() {
		naipe = new ArrayList<Carta>();
		generarNaipe();
	}

	//GETTERS AND SETTERS
	public ArrayList<Carta> getNaipe() {
		return naipe;
	}

	public void setNaipe(ArrayList<Carta> naipe) {
		this.naipe = naipe;
	}
	
	//METODO GENERAR NAIPE
	public void generarNaipe() {
		String[] palo = {"D", "T", "CN", "CR"};
		String[] valore = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		
		for(int i=0;i<palo.length;i++) {
			for(int j=0;j<valore.length;j++) {
				Carta carta = new Carta(valore[j], 0, palo[i]);
				naipe.add(carta);
			}
		}
	}
	
	//METODO IMPRIMIR
	public void imprimir() {
		for (Carta carta : naipe) {
			System.out.println(carta.getValor()+" - "+carta.getPalo()+" Valor juego: "+carta.getValorJuego());
		}
	}
}
