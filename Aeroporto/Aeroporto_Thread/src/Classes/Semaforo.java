package Classes;

import java.util.concurrent.Semaphore;

public class Semaforo {
	
	Pista_Norte pn = new Pista_Norte();
	Pista_Sul ps = new Pista_Sul();
	private Semaphore s;
	
	public Semaforo(Semaphore s) {
		this.s = s;
	}
	
	public void escolha(int id,int manobrar,int taxiar,int decolar,int afastar) {
						
			try {
				s.acquire();
				if(pn.isLivre()) {
					pn.setLivre(false);
					pn.tentar_pousar(id,manobrar, taxiar,decolar,afastar);
					pn.setLivre(true);

				}else if(ps.isLivre()) {
		
					ps.setLivre(false);
					ps.tentar_pousar(id,manobrar, taxiar,decolar,afastar);
					ps.setLivre(true);
				
				}	
			} catch (InterruptedException e) {
				e.printStackTrace();
			}finally {
				s.release();
			}
	}
	
}