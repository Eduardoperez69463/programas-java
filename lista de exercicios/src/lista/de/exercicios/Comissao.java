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
public class Comissao {
    public static void main(String[] args) {
        double prep,quntp,valorco,valorto;
        
        
        
        
        
        Scanner entrada = new Scanner (System.in);
        
        
        
        System.out.println("digite o valor de cada peça:");
        prep= entrada.nextDouble();
        System.out.println("digite quantas peças foram vendidas:");
        quntp= entrada.nextDouble();
      
        
        valorto = prep*quntp;
        valorco = valorto*0.05;
        
        System.out.println("Com o  ganho de R$"+valorto+ " a comissão(5%) será de R$"+valorco);
}
}