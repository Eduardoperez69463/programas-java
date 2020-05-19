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
public class horas {
    
        public static void main(String[] args) {
        double horas,minutos,total ;
        
        
        
        
        
        Scanner entrada = new Scanner (System.in);
        
        
        
        System.out.println("digite somente as horas:");
        horas= entrada.nextDouble();
        System.out.println("digite somente os minutos:");
        minutos= entrada.nextDouble();
        
        total=horas+(minutos/60);
       
        
        System.out.println("Para calculos matematicos o valor é :"+total);
    }
    
}
