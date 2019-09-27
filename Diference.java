package curso;
import java.util.Scanner;
public class Diference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int diference;
		
		System.out.println("Digite o valor de A ");
		int a = sc.nextInt();
		System.out.println("Digite o valor de B ");
		int b = sc.nextInt();
		System.out.println("Digite o valor de C ");
		int c = sc.nextInt();
		System.out.println("Digite o valor de D ");
        int d = sc.nextInt();
		
        
        System.out.println("o valor de A " + a);
        System.out.println("o valor de B " + b);
        System.out.println("o valor de C " + c);
        System.out.println("o valor de D " + d);
        
        diference = (a * b - c * d);
        System.out.println("A diferença é: " + diference);
        
	sc.close();
	}

}
