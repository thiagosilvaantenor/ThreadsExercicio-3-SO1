package controller;

public class ThreadVetorController extends Thread {

//	Criar em java um projeto com uma Thread chamada ThreadVetor, que receba um
//	valor numérico e vetor como parâmetros. Caso o valor numérico seja par, a thread deve
//	percorrer o vetor utilizando uma estrutura for (int i = 0 ; i < vet.length; i++) e contar o
//	tempo para percorrer o vetor. Caso o valor numérico seja ímpar, a thread deve percorrer
//	o vetor utilizando uma estrutura foreach e contar o tempo para percorrer o vetor. No
//	final, ambas as possibilidades devem apresentar o tempo em segundos.

	private int num;
	private int[] arr;

	public ThreadVetorController(int num, int[] arr) {
		this.num = num;
		this.arr = arr;
	}

	@Override
	public void run() {
		double inicio = 0;
		double fim = 0;
		double resultado = 0;
		String tipo = null;
		// Caso num par
		if (num % 2 == 0) {
			tipo = "for";
			inicio = System.nanoTime();
			for (int i = 0; i < arr.length; i++) {
			}
			fim = System.nanoTime();
		}

		// Caso num impar
		else {
			tipo = "forEach";
			inicio = System.nanoTime();
			for (int el : arr) {

			}
			fim = System.nanoTime();
		}
		
		resultado = fim - inicio;
		resultado /= Math.pow(10, 9);
		
		System.out.println("Tempo para percorrer o vetor[" + arr.length + "], utilizando o laço " 
				+ tipo + ", foi: " + resultado + "ms");
	}

}
