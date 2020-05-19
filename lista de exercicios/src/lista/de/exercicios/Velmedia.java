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
public class Velmedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double per,temph,tempm,tempg,vel;
        
        
        
        
        
        Scanner entrada = new Scanner (System.in);
        
        
        
        System.out.println("digite o valor do percurso:");
        per= entrada.nextDouble();
        System.out.println("digite somente as horas:");
        temph= entrada.nextDouble();
        System.out.println("digite somente os minutos:");
        tempm= entrada.nextDouble();
        
        tempg=temph+(tempm/60);
        vel=per/tempg;
        
        System.out.println("a velocidade media é" +vel+"KM/H");
    }
    
}
