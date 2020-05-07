
package retangulo;

import java.util.Scanner;


public class Retangulo {
    public static void main(String[] args) {
       double area,perimetro,base,altura;
       
       Scanner entrada = new Scanner(System.in);
       
      System.out.println("Digite a base ");
      base=entrada.nextDouble();
      
      System.out.println("Digite a altura");
      altura=entrada.nextDouble();
      
      
      area=base*altura;
      perimetro=base+base+altura+altura;
      
      
      
      System.out.println("A área do retangulo é:"+area);
      System.out.println("a área do perimetro é:"+perimetro);   
    
      
    
}
}
