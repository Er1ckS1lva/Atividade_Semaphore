package Classes;

import java.util.Random;


public class Aviao implements Runnable {

	
	private int Manobrar;
	private int Taxiar;
	private int Decolar;
	private int Afastar;
	private Semaforo s;
	private int Id;

	public Aviao(Semaforo s) {
		Random gerador = new Random();
		this.Id = gerador.nextInt(1000)+1;
		this.Manobrar = gerador.nextInt(5)+3;
		this.Taxiar = gerador.nextInt(6)+5;	
		this.Decolar = gerador.nextInt(2)+3;
		this.Afastar = gerador.nextInt(4)+5;
		this.s = s;
		new Thread(this).start();
	
	}


	public void run(){
			
		this.s.escolha(this.Id,this.Manobrar, this.Taxiar, this.Decolar, this.Afastar);
			
	}
	
	
}
