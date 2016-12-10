/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin10_1;

import javax.swing.JOptionPane;

/**
 *
 * @author Adry
 */
public class JuegoCoop {
    public void JuegoCoop(){
        int i=0,numero,nIntentos,resultado;
        do{
            numero=Integer.parseInt(JOptionPane.showInputDialog("J1 introduce un numero entre 1 y 50"));
            nIntentos=Integer.parseInt(JOptionPane.showInputDialog("J1 introduce numero de intentos,minimo 1"));
    }while ((numero<1||numero>50)||nIntentos<1);
        do{
            resultado=Integer.parseInt(JOptionPane.showInputDialog("J2 introduce resultado entre 1 y 50"));
            if (resultado>numero)
                JOptionPane.showMessageDialog(null,"El numero es menor");
            else if (resultado<numero)
                JOptionPane.showMessageDialog(null,"El numero es mayor");
            else JOptionPane.showMessageDialog(null,"¡Acertaste!");
            i++;
        }while (resultado!=numero||i==nIntentos);
        
    }
}