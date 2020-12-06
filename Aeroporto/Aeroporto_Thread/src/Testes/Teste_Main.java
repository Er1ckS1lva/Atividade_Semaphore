package Testes;

import java.util.concurrent.Semaphore;

import Classes.Aviao;
import Classes.Semaforo;

public class Teste_Main {

	public static void main(String[] args) {
		
		Semaphore sep = new Semaphore(2);
		Semaforo s = new Semaforo(sep);
		
		int quantidade_avioes = 8;
		
		for(int i =0;i < quantidade_avioes;i++) {
			@SuppressWarnings("unused")
			Aviao aero = new Aviao(s);
		}
		
	}

}
