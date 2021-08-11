package arcade.Domino;

import java.util.ArrayList;
import java.util.Collections;

public class Domino {
	static int cantidadJugadores = 4;
	ArrayList<int[]> fichas;
	Jugador jugador;
	Jugador[] jugadores;
	
	public Domino(Jugador jugador) {
		this.fichas = new ArrayList<>();
		this.jugador = jugador;
		this.jugadores = new Jugador[4];
		crearFichas();
		crearJugadores();
	}
	private void crearFichas() {
		for(int i=0; i<=6; i++) {
			for(int j=0; j<=6; j++) {
				int[] ficha = new int[2];
				ficha[0] = i;
				ficha[1] = j;
				fichas.add(ficha);
			}
		}
		for(int i = 0; i < fichas.size(); i++) {
			for(int j=0; j < fichas.size(); j++) {
				if(fichas.get(i)[0] == fichas.get(j)[1] && fichas.get(i)[1] == fichas.get(j)[0] && j!=i) {
					fichas.remove(i);
				}
			}
		}
	}
	
	private void crearJugadores() {
		ArrayList<String> nombres = new ArrayList<>();
		nombres.add("Fabian");nombres.add("Ingrid");nombres.add("Jhonatan");nombres.add("Sandra");nombres.add("Carlos");nombres.add("Diana");nombres.add("Juan");nombres.add("Linda");
		Collections.shuffle(nombres);
		for(int i = 0; i < 4; i++) {
			if(i == 0) {
				jugadores[i] = jugador;
			}else if(nombres.get(i)!= jugador.nombre){
				Jugador npc = new Jugador(nombres.get(i));
				jugadores[i] = npc;
			}else {
				i--;
			}
		}
		for(int i = 0; i < jugadores.length; i++) {
			System.out.println(jugadores[i].nombre);
		}
	}
	
	private void revolverFichas() {
		Collections.shuffle(fichas);
		int cantidad = 0;
		for(Jugador jugador: jugadores) {
			for(cantidad = 0; cantidad < fichas.size(); cantidad++) {
				jugador.añadirFicha(fichas.get(cantidad));
			}
			cantidad += 7;
		}
	}
	
	public Jugador[] jugadores() {
		return jugadores;
	}
	
	public void ganador(Jugador jugador) {
		if(jugador.cantidadFichas() == 0) {
			System.out.println(jugador.nombre + " Es el ganador!");
		}
	}
	
	
	
}
