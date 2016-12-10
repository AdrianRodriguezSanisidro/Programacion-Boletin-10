/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin10;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Adry
 */
public class JuegoAdivinanza {
    int i=1,numero,nIntentos,resultado;
    public void JuegoCoop(){
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
        }while (resultado!=numero&&i<=nIntentos);
    }
    public void JuegoSolitario(){
        Random rdm=new Random();
       resultado=rdm.nextInt(49)+1;
     do{
         numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce numero"));
         if ((numero-resultado)==0&&(resultado-numero)==0){
             JOptionPane.showMessageDialog(null,"Has acertado");
             resultado=rdm.nextInt(49)+1;
         }
         else if ((numero-resultado)<=5&&(resultado-numero)<=5)
             JOptionPane.showMessageDialog(null,"Estas muy cerca");
         else if ((numero-resultado)<10&&(resultado-numero)<10)
             JOptionPane.showMessageDialog(null,"Estas cerca");
         else if ((numero-resultado)<=20&&(resultado-numero)<=20)
             JOptionPane.showMessageDialog(null,"Estas lejos");
         else if ((numero-resultado)>20&&(resultado-numero)>20)
             JOptionPane.showMessageDialog(null,"Estas muy lejos");
         if (numero==0)
             JOptionPane.showMessageDialog(null,"Juego cancelado");
     }while (numero!=0);
        System.out.println(resultado);
    }
}