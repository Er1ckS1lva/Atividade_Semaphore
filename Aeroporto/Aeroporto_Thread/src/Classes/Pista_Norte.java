package Classes;

public class Pista_Norte {
	
	private boolean livre = true;
	
	public Pista_Norte() {		
		
	}

	public synchronized void tentar_pousar(int id,int manobrar,int taxiar,int decolar,int afastar) {

			aviao_manobra(id,manobrar, taxiar);
			decolagem(id,decolar,afastar);
			System.out.println(" Pista norte esta livre.");
			
		
	}	

	public void aviao_manobra(int id,int manobrar, int taxiar){
		System.out.println(" Avi�o "+id+" est� indo para pista norte.");
		
		try{
			System.out.println(" Avi�o "+id+" est� manobrando (PN).");
			wait(manobrar*1000);
		}catch (Exception e){			
		}
		try{
			System.out.println(" Avi�o "+id+" est� taxiando (PN).");
			wait(taxiar*1000);
		}catch (Exception e){			
		}
	}

	public void decolagem(int id,int decolando, int afastando){
		
		try{
			System.out.println(" Avi�o "+id+" est� decolando (PN).");
			wait(decolando*1000);
		}catch (Exception e){			
		}
		try{
			System.out.println(" Avi�o "+id+" est� se afastando do aeroporto.");
			wait(afastando*1000);
		}catch (Exception e){			
		}
	}
	
	public boolean isLivre() {
		return livre;
	}

	public void setLivre(boolean livre) {
		this.livre = livre;
	}	
}
