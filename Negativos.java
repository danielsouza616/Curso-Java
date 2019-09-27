package curso;
import java.util.Scanner;
public class Negativos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite um número");
		int n1 = sc.nextInt();
  
		if (n1 < 0) {
		   System.out.println("Negativo"); }
    
		else {
		    System.out.println("Positivo"); }
		sc.close();
    
	}
}
