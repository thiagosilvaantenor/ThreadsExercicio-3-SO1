package view;

import controller.ThreadVetorController;

public class Main {

	public static void main(String[] args) {

//		A operação main deve gerar um vetor de 1000 posições com valores aleatórios de 1 a
//		100. Deve iniciar 2 ThreadVetor e para uma passar o número 1 e o vetor e para a outra,
//		passar o número 2 e o mesmo vetor.

		int[] vetor = new int[1000];
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * 100) + 1;
		}
		
		Thread ex3 = new ThreadVetorController(1,vetor);
		Thread thr3 = new ThreadVetorController(2,vetor);
		
		ex3.start();
		thr3.start();
		
		
		
	}
}
