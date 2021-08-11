package arcade.Domino;

import java.util.ArrayList;

public class Jugador {
	private ArrayList<int[]> fichas;
	public String nombre;
	private int cantidadFichas;
	
	public Jugador(String nombre) {
		this.nombre = nombre;
		this.cantidadFichas = 7;
	}
	
	public void añadirFicha(int[] ficha) {
		fichas.add(ficha);
	}
	
	protected int cantidadFichas() {
		return cantidadFichas;
	}
	
	
	
}
