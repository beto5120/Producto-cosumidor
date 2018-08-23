package net.netasystems.granja;

import java.util.ArrayDeque;
import java.util.Queue;

public class Parcela {
	
	private static Queue<Maiz> parcela = new ArrayDeque<>();
	
	public static void addMaiz(Maiz Maiz){
		parcela.add(Maiz);
		
	}
	
	public static Maiz getMaiz() {
		return parcela.poll();
	}

	
}
