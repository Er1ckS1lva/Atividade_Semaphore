package br.edu.iftm.classes;
import java.util.Random;

public class Aviao implements Runnable{
	
	private int Manobrar;
	private int Taxiar;
	private int Decolar;
	private int Afastar;
	private int Id;
	private Pista_Norte pn;
	private Pista_Sul ps;
	private boolean vez;


	public Aviao(Pista_Norte pn, Pista_Sul ps) {
		Random gerador = new Random();
		this.Id = gerador.nextInt(1000)+1;
		this.Manobrar = gerador.nextInt(5)+3;
		this.Taxiar = gerador.nextInt(6)+5;	
		this.Decolar = gerador.nextInt(2)+3;
		this.Afastar = gerador.nextInt(4)+5;
		this.vez = true;
		this.pn = pn;
		this.ps = ps;
		Thread(this).start();
		
	}


	public void run(){
		while(this.vez){
			this.vez = pn.tentar_pousar(this.Id,this.Manobrar,this.Taxiar,this.Decolar,this.Afastar);
			this.vez = ps.tentar_pousar(this.Id,this.Manobrar,this.Taxiar,this.Decolar,this.Afastar);
		}
	}
}
