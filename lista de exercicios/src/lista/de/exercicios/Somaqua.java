/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.de.exercicios;

import java.util.Scanner;

/**
 *
 * @author dupfr
 */
public class Somaqua {public static void main(String[] args) {
        double numa,numb,numc,numd,soma;
        
        
        
        
        
        Scanner entrada = new Scanner (System.in);
        
        
        
        System.out.println("digite o valor do primeiro numero:");
        numa= entrada.nextDouble();
        System.out.println("digite o valor do segundo numero:");
        numb= entrada.nextDouble();
        System.out.println("digite o valor do terceiro numero:");
        numc= entrada.nextDouble();
        System.out.println("digite o valor do quarto numero:");
        numd= entrada.nextDouble();
        
        soma = (numa*numa)+(numb*numb)+(numc*numc)+(numd*numd);
        
        System.out.println("Então a conta vai ficar "+numa+"²+"+numb+"²+"+numc+"²+"+numd+"²="+soma);
    
}
}
