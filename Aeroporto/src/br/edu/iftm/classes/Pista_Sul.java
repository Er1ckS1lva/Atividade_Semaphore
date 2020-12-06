package br.edu.iftm.classes;
import java.util.Random;
import java.util.concurrent.Semaphore;

public class Pista_Norte {
	

	private boolean Livre;
	
	public Pista_Sul() {
		
		this.Livre = true;
		
	}

	public boolean tentar_pousar(int id,int manobrar,int taxiar,int decolar,int afastar) {

		if(this.Livre){
			this.Livre = false;
			aviao_manobra(id,manobrar, taxiar);
			decolagem(id,decolar,afastar);
			this.Livre = true;
		}
		return false;
	}	

	public synchronized void aviao_manobra(int id,int manobrar, int taxiar){
		System.out.println(" Avião "+id+" chegou ao aeroporto.");
		
		try{
			System.out.println(" Avião "+id+" está manobrando (PS).");
			wait(manobrar*1000);
		}catch (Exception e){			
		}
		try{
			System.out.println(" Avião "+id+" está taxiando (PS).");
			wait(taxiar*1000);
		}catch (Exception e){			
		}
	}

	public synchronized void decolagem(int id , int decolando, int afastando){
		
		try{
			System.out.println(" Avião "+id+" está decolando (PS).");
			wait(decolando*1000);
		}catch (Exception e){			
		}
		try{
			System.out.println(" Avião "+id+" está se afastando do aeroporto.");
			wait(afastando*1000);
		}catch (Exception e){			
		}
	}
}
