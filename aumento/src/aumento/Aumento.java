
package aumento;

import java.util.Scanner;


public class Aumento {

    public static void main(String[] args) {

        
        double preco, resul;
        String  nome;
        
       Scanner entrada = new Scanner(System.in);
       
       
       
       System.out.println("Digite o nome do produto");
       nome = entrada.next();
       
       
       
       System.out.println("digite o preço do produto");
       preco = entrada.nextDouble();
       
       
       
       resul = (preco*1.65);
       
       
       System.out.println( "Você vai vender o produto: "+nome+"por R$"+resul);
    
       
      
    }
    
}
