package net.netasystems.granja;

import java.util.Random;

public class Agricultor implements Runnable {
	
	private Random ram = new Random();
	
	private void siembraOcosecha() {
		
		Parcela.addMaiz(new Maiz (getCantidadRandom(), getMaizDescripcion()));
	}
	
	public int getCantidadRandom() {
		return (int) ram.nextInt(10);
	}
	
	public String getMaizDescripcion() {
		String tiposMaiz[] = {"Transgenico", "Normal", "sin gluten", "Organico", "BLanco", "Negro", "Con guitlacoche"};
		int index = (int) ram.nextInt(10);
		return tiposMaiz[index];
	}

	@Override
	public synchronized void run() {
		while(true) {
			siembraOcosecha();
			try {
				Thread.sleep(30000);
			}catch (InterruptedException e) {
				System.out.println();
			}
		}
		
	}

}
