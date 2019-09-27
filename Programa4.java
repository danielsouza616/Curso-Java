package curso;
import java.util.Scanner;
public class Programa4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
	   	  System.out.println("Digite seu nome: ");
	   	  String name = sc.next();
          System.out.println("Quantos comodos tem em sua casa? ");
          int rooms = sc.nextInt();
          System.out.println("Qual o preco do produto? ");
		  double price = sc.nextDouble();
           
          
           
           
           System.out.println("Seu nome é: " + name);
           System.out.println(rooms);
           System.out.println(price);


		
		
     sc.close();		
	}

}
