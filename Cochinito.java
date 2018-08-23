package net.netasystems.granja;

public class Cochinito implements Runnable {
	
	public void consumeMaiz() {
		
		Maiz maizParacosumir = Parcela.getMaiz();
		System.out.println("Estoy consumiendo"+ maizParacosumir.toString());
		
	}

	@Override
	public synchronized void run() {
		while(true) {
			consumeMaiz();
			try {
				Thread.sleep(30000);
			}
			
			catch(InterruptedException e) {
				System.out.println("Hola");
			}
		}
	}

}
