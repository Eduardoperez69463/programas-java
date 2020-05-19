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
public class Dolareal {public static void main(String[] args) {
        double dolar,real,aa;
        
        
        
        
        
        Scanner entrada = new Scanner (System.in);
        
        
        
        System.out.println("digite o valor de um dolar em R$:");
        dolar= entrada.nextDouble();
        System.out.println("digite quantos reais você quer converter:");
        real= entrada.nextDouble();
        
        
       
        aa = real/dolar;
        
        System.out.println("você vai ter $"+aa);
    
}
}