package AtividadePOO2;

import java.util.Scanner;

public class Atv2restaurante {

   
    public static void main(String[] args) {
        double V,P,VD;
        
      Scanner sc = new Scanner (System.in);
      
      System.out.println("Qual o valor da conta?");
      V = sc.nextDouble();
      System.out.println("Quantas pessoas vao dividir a conta?");
      P = sc.nextDouble();
      VD = V / P; 
              System.out.println("O valor da conta dividido para "+P+ " pessoas foi de "+VD+ "R$");
      sc.close();
       
    }
    
}
