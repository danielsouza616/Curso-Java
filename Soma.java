package curso;
import java.util.Scanner;
public class Soma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a = 0, b = 0;
		int soma = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor ");
		int a = sc.nextInt();
		System.out.println("Digite o segundo valor ");
		int b = sc.nextInt();
		
		soma = a + b;
		
		System.out.println("A soma dos dois valores é: " + soma);
		
		sc.close();

	}

}
