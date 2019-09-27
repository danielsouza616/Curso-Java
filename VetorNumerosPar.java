package curso;
import java.util.Scanner;
import java.util.Random;
public class VetorNumerosPar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); // inicializo a classe Sccaner
		Random gerador = new Random();
		
		System.out.println("Digite a quantidade de posições no array a ser criadas");
		int n = sc.nextInt(); // entrada de dados para a quantidade de possições
		int[] x = new int[n]; // Criar e Iniciarlizar o vetor numeros com N posições
		
		for (int i = 0; i < x.length; i++) { // Condição para funcionar corretamente
			x[i] = (int) Math.round(Math.random() * 50); // atribui valores aleatorios a cada possição do array
			x[6] = 4; // Atribuir manualmente um valor em uma determinada posição do array
      }
		for (int i = 0; i < x.length; i++) {
		  if ((x[i] % 2) == 0) 
		 //System.out.println("Posições com numeros Pares");
		System.out.println(i + " - " + x[i]);
		
		  
		
		}
	}

}
