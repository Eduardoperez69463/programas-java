
package aumento;

import javax.swing.JOptionPane;


public class Aumento {

    
    public static void main(String[] args) {
double salario,aumento = 0;

salario=Double.parseDouble( JOptionPane.showInputDialog("Digite o seu salario"));

if(salario<=1500){
aumento = salario* 0.20
        ;}
if((salario > 1500)&&(salario <= 3000)) {
aumento=salario * 0.15
        ;}
if(salario > 3000){
aumento = salario * 0.10;}

JOptionPane.showMessageDialog(null,"voce tera  R$"+aumento+"  a mais pelo seu  aumento.");
    }
    
}
