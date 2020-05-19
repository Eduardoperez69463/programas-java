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
public class carro {public static void main(String[] args) {
        double fab,imum,ims,imdois,total;
        
        
        
        
        
        Scanner entrada = new Scanner (System.in);
        
        
        
        System.out.println("digite o preço de fabrica do carro:");
        fab= entrada.nextDouble();
        imum =fab*0.45;
        ims =imum+fab;
        imdois =ims*0.28;
        total =fab+imum+imdois;
        
        
        System.out.println("O preço total com os impostos e com a distribuiçao é:"+total);
    
}
}
