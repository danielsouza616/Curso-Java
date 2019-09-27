package curso;
import java.util.Scanner;
public class Prova_1_2019_2 {
	public static void main(String[] args) {
        exibirMenu();
        converterFparaC();
        converterCparaF();
        converterMparaP();
        converterPparaM();
   }
  
   
   
   public static void exibirMenu(){
       String condicao = "S";
       int Menu = 0;
   Scanner input = new Scanner(System.in);
    //laço de repetição
        while(condicao.equalsIgnoreCase("S")) {
      // menu de exibição
          System.out.println("Bem-Vindo ao Conversor: ");
          System.out.println("[1] Celsius -> Fahrenheit");
          System.out.println("[2] Fahrenheit -> Celsius");
          System.out.println("[3] Milímetros -> Polegadas");
          System.out.println("[4] Polegadas -> Milímetros");
          System.out.println("Informe a opção desejada: ");
          Menu = input.nextInt();
   }

   }
   
   public static void converterCparaF(){
    // converter Celsius -> Fahrenheit
    double Celsius = 0, Fahrehit;
    Scanner input2 = new Scanner(System.in);//conversor de temperatura
              System.out.println("Informe a temperatura em Celsius: ");
              Celsius = input2.nextDouble();
              Celsius = (Celsius * 9/5) + 32;
              System.out.println("A memida convertida é: " + Celsius + " fahrehit");
}
   
   
    public static void converterFparaC(){
        double Celsius = 0, Fahrehit;
        
    Scanner input2 = new Scanner(System.in); //conversor de temperatura    
    System.out.println("Informe a temperatura em Farehit: ");
              Fahrehit = input2.nextDouble();
              Fahrehit = (Fahrehit -32) *5/9;
              System.out.println("A medida convertida é: " + Fahrehit + " celsius");
    
}
    
    public static void converterMparaP(){
    double Milimetros = 0, Polegadas;
    
    Scanner input3 = new Scanner(System.in);//conversor de medidas
    //converter Milímetros -> Polegadas
              System.out.println("Informe quantos milímetros: ");
              Milimetros = input3.nextDouble();
              Milimetros = (Milimetros / 25.4);
              System.out.println("A medida convertida é: " + Milimetros + " polegadas"); }
    
    
    public static void converterPparaM(){
    double Milimetros = 0, Polegadas;
    String condicao = "S";
    Scanner input4 = new Scanner(System.in);
    Scanner input3 = new Scanner(System.in);//conversor de medidas
    // converter Polegadas -> Milímetro
              System.out.println("Informe quantas polegadas: ");
              Polegadas = input3.nextDouble();
              Polegadas = (Polegadas * 25.4);
              System.out.println("A medida convertida é: " + Polegadas + " milímetros"); 
    
    System.out.println("Deseja continuar [S] ou [N]? ");
               condicao = input4.next();
            System.out.println("##### PROGRAMA ENCERRADO ##### ");
    
    }
    
}



