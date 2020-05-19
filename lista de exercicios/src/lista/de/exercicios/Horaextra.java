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
public class Horaextra {
    public static void main(String[] args) {
        double minutos,hora,cm,ghora,gfi,gfie;
        
        
        
        
        
        Scanner entrada = new Scanner (System.in);
        
        
        
        System.out.println("digite o valor de quanto voce ganha por hora:");
        ghora= entrada.nextDouble();
        System.out.println("digite somente as horas extras trabalhadas:");
        hora= entrada.nextDouble();
        System.out.println("digite somente os minutos extras trabalhados:");
        minutos= entrada.nextDouble();
        
        cm=hora+(minutos/60);
        gfi=cm*ghora;
        
        System.out.println("Ganhando mais 70% do salario normal voce ganhara"+gfi+(gfi*0.7));
    
}
}
