
package emprestimo;

import java.util.Scanner;

public class Emprestimo {

    public static void main(String[] args) {
   double emp,taxa, result;
   int temp;
   
   Scanner entrada = new Scanner(System.in);
   
   
   System.out.println("Quanto quer emprestado?");
   emp = entrada.nextDouble();
   System.out.println("Em quanto meses vai pagar?");
   temp = entrada.nextInt();
   
   
   
   taxa = 0.02;
   
   
   
   result = emp*(Math.pow((1+taxa),temp));
   
   
   
   System.out.println("Ao final de " + temp+" meses você ira pagar R$"+result);
        
    }
    
}
