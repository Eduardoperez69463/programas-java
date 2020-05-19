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
public class Viagem {
    public static void main(String[] args) {
        double dis,pre,quant,viagem;
        
        
        
        
        
        Scanner entrada = new Scanner (System.in);
        
        
        
        System.out.println("digite quantos km voce precisa percorrer:");
        dis= entrada.nextDouble();
        System.out.println("digite quantos km seu carro percorre com 1l de gasolina:");
        quant= entrada.nextDouble();
        System.out.println("digite o preço medio da gasolina:");
        pre= entrada.nextDouble();
        
        viagem=(dis/quant)*pre;
        
        System.out.println("o preço de ida da viagem é:"+viagem +"e o preço de ida e volta é:"+viagem*2);
    
}
}
