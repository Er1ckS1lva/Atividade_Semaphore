package br.edu.iftm.testes;
import br.edu.iftm.classes.Aviao;
import br.edu.iftm.classes.Pista_Norte;

public class Teste_Main {

	public static void main(String[] args) {
		
		int quantidade = 4;
		Pista_Norte pn = new Pista_Norte();
		Pista_Sul ps = new Pista_Sul();
		
		for(int i = 0;i < quantidade;i++){
			Aviao aero = new Aviao(pn,ps);
		}
		
		
	}

}
