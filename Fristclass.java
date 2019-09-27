package curso;

import java.util.Scanner;

public class Fristclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Hello, Word");
		
		int x, y, soma;
		
		System.out.println("Informe o primeiro valor: ");
		x = sc.nextInt();
		System.out.println("Informe o segundo valor: ");
		y = sc.nextInt();
		
	   soma = x + y;
	   System.out.println("O resultado da soma é: " + soma);
	   
	

	}

}
