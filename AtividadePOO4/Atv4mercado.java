package AtividadePOO4;

import java.util.Scanner;

public class Atv4mercado {

   
    public static void main(String[] args) {
     String produto;
     double precounitario,precototal,P10,P20,P25,PD10,PD20,PD25;
     int quantidade;
    // P10, P20 E P25: valor do desconto
    //PD10,PD20 E PD25: valor descontado
      Scanner sc = new Scanner (System.in);
      System.out.println("Informe o nome do produto");
      produto = sc.nextLine();
      System.out.println("Insira o valor unitário do produto");
      precounitario = sc.nextDouble();
      System.out.println("Insira a quantidade do produto");
      quantidade = sc.nextInt();
      precototal = precounitario * quantidade;
      if (quantidade <= 10){
      System.out.println("O valor total é "+ precototal+" R$, obrigado e volte sempre");
      }else if (quantidade > 10 && quantidade <= 20){
        P10 = (precototal * 10) / 100; 
        PD10 = precototal - P10;
        System.out.println("Você ganhou um desconto de 10%, então, o novo valor é R$ "+PD10+", obrigado e volte sempre");
      }else if (quantidade > 20 && quantidade <= 50 ){
        P20 = (precototal * 20) / 100;
        PD20 = precototal - P20;
        System.out.println("Você ganhou um desconto de 20%, então, o novo valor é R$ "+PD20+", obrigado e volte sempre");
      }else if (quantidade > 50){ 
        P25 = (precototal * 25) / 100;
        PD25 = precototal - P25;
        System.out.println("Você ganhou um desconto de 25%, então, o novo valor é R$ "+PD25+", obrigado e volte sempre");
        sc.close();
      }
    
    }
    }

