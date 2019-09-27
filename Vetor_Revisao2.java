package curso;
import java.util.Scanner;
import java.util.Random;

 public class Vetor_Revisao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); // inicializo a classe Sccaner
		Random gerador = new Random();

		System.out.println("Digite a quantidade de posições no array a ser criadas");
		int n = sc.nextInt(); // entrada de dados para a quantidade de possições
        int [] mult = new int[n];
		int[] x = new int[n]; // Criar e Iniciarlizar o vetor numeros com N posições
		int[] y = new int[n];
		for (int i = 0; i < x.length; i++) { // Condição para funcionar corretamente
			x[i] = (int) Math.round(Math.random() * n); // atribui valores aleatorios a cada possição do array
			x[6] = 616; // Atribuir manualmente um valor em uma determinada posição do array
			
           }
		
		for (int i = 0; i < y.length; i++) {
		y[i] = x[i] * 2;
		}
		
		System.out.println("----------------------X----------------");
		System.out.println("Quantidade de posições criadas no array: " + x.length); // Imprime a quantidade total
																							// de posições criadas no
																							// array
		System.out.println("O valor contido a possição 5 do array é: " + x[5]); // Imprime somente o valor contido
																						// na posição 5 do array numeros
		System.out.println("O valor atribuido a posição 6: " + x[6]);
		System.out.println("----------------------Y---------------");

		System.out.println("O valor atribuido a posição 6: " + y[6]); // valor contido na posição 6 do array
		System.out.println("Quantidade de posições criadas no array: " + y.length); // Imprime a quantidade total
																							// de posições criadas no
																			// array

	}
}