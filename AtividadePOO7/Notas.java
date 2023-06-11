package AtividadePOO7;

import java.util.Scanner;
import javax.swing.JOptionPane;
public class Notas {
 Scanner sc = new Scanner("System.in");
 public String nome;
 public Double resultado,nota1,nota2;
 
 public void Calcular(){
     nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: "));
             
     nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota: "));
     
     resultado = (nota1 + nota2) / 2;
             if (resultado >=6 ){
             JOptionPane.showMessageDialog(null,"Média: " + resultado + " Aluno APROVADO!");
             }
             else if (resultado >= 4 && resultado < 6){
             JOptionPane.showMessageDialog(null,"Média: " + resultado + " Aluno em RECUPERAÇÃO!"); 
             }
             else {
             JOptionPane.showMessageDialog(null,"Média: " + resultado + " Aluno REPROVADO!");    
             }
 }
}
   
   
