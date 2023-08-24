package view;

import java.util.Arrays;

import packageOfOrdering.*;

public class Principal {
	public static void main(String[] args) {

		BubbleSort bubblesort = new BubbleSort();
		MergeSort mergesort = new MergeSort();

		// TODO: Exercício 1
		/* 1. Considere o seguinte vetor: 74 20 74 87 81 16 25 99 44 58 */
		
		int[] vetorExercicio_1 = { 74, 20, 74, 87, 81, 16, 25, 99, 44, 58 };
		System.out.println("Vetor Inicial: " + Arrays.toString(vetorExercicio_1));

		bubblesort.bubbleSort(vetorExercicio_1);
		System.out.println("Vetor Ordenado: " + Arrays.toString(vetorExercicio_1));

		
		System.out.println();// pula linha

		
		// TODO: Exercício 2
		/* 2. Considere o seguinte vetor: 44 43 42 41 40 39 38 */
		int[] vetorExercicio_2 = { 44, 43, 42, 41, 40, 39, 38 };
		int inicio = 0 , fim = (vetorExercicio_2.length - 1);
		System.out.println("Vetor Inicial: " + Arrays.toString(vetorExercicio_2));
		
		mergesort.mergeSort(vetorExercicio_2, inicio, fim);
		System.out.println("Vetor Ordenado: " + Arrays.toString(vetorExercicio_2));

	}
}
