package curso;
import java.util.Scanner;
import entities.Product;
public class ControleEstoque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		Product p1 = new Product();
		System.out.println("Informe o produto");
		p1.nome = sc.next();
		System.out.println("Informe o valor do produto");
		p1.preco = sc.nextDouble();
		System.out.println("Informe a quantidade em estoque");
		p1.quant = sc.nextInt();
		
		System.out.println("Produto: " + p1.nome);
		System.out.println("O preço do produto é: " + p1.preco);
		System.out.println("Quantidade em estoque: " + p1.quant);
		System.out.println("Valor total em estoque: " + p1.totalValueStock());
		
		
		//Para adicionar a quantidade do mesmo produto
		//int quant = sc.nextInt();
		//p1.addProduct(quant);
		
		//Para diminuir a quantidade do mesmo produto
		//int quant =sc.nextInt();
		//p1.removeProduct(quant);
		
sc.close();		
	}

}
