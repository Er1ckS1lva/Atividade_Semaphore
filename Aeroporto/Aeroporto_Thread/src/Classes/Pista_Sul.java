package Classes;

public class Pista_Sul {

	private boolean livre = true;
	public Pista_Sul() {	
	}

	public synchronized void tentar_pousar(int id,int manobrar,int taxiar,int decolar,int afastar) {

		
			
			aviao_manobra(id,manobrar, taxiar);
			decolagem(id,decolar,afastar);
			System.out.println(" Pista sul esta livre.");
			
		
	}	

	public void aviao_manobra(int id,int manobrar, int taxiar){
		System.out.println(" Avi�o "+id+" est� indo para pista sul.");
		
		try{
			System.out.println(" Avi�o "+id+" est� manobrando (PS).");
			wait(manobrar*1000);
		}catch (Exception e){			
		}
		try{
			System.out.println(" Avi�o "+id+" est� taxiando (PS).");
			wait(taxiar*1000);
		}catch (Exception e){			
		}
	}

	public void decolagem(int id,int decolando, int afastando){
		
		try{
			System.out.println(" Avi�o "+id+" est� decolando (PS).");
			wait(decolando*1000);
		}catch (Exception e){			
		}
		try{
			System.out.println(" Avi�o est� "+id+" se afastando do aeroporto.");
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
