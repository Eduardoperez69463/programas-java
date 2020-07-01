
package banco;

import javax.swing.JOptionPane;


public class Banco {

    
    public static void main(String[] args) {
        double saque, saldoatual,saldofinal,limite;
        saldoatual = 1000;
        limite = 2000;
        
        saque =Double.parseDouble( JOptionPane.showInputDialog("Quanto você quer sacar?"));
        
        saldofinal = saldoatual-saque;
        
        if (saldofinal>=0){
        JOptionPane.showMessageDialog(null,"Seu saldo final é R$"+saldofinal);}
        
        if((saldofinal<0)&&(saldofinal>=(-limite))){
        JOptionPane.showMessageDialog(null,"Seu saldo é negativo com R$"+saldofinal);
           
    }
        
       else
        JOptionPane.showMessageDialog(null,"voce nao tem limite suficiente seu limite é R$"+limite);
    }
    
}
