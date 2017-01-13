/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin14;

import javax.swing.JOptionPane;

/**
 *
 * @author Adri
 */
public class Boletin14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("MENÚ:\n1. Celsius a Fahrenheit\n2. Celsius a Reamur\n3. Exit"));
        while (n < 1 || n > 3) {
            JOptionPane.showMessageDialog(null, "Introduce un numero valido");
            n = Integer.parseInt(JOptionPane.showInputDialog("MENÚ:\n1. Celsius a Fahrenheit\n2. Celsius a Reamur\n3. Exit"));
        }
        while (n > 0 && n < 3) {
            switch (n) {
                case 1:
                    int temperatura = Integer.parseInt(JOptionPane.showInputDialog("Introduce una temperatura > 80ºC"));
                    try {
                        Conversor.CtoF(temperatura);
                        JOptionPane.showMessageDialog(null, Conversor.CtoF(temperatura) + "F");
                    } catch (TemperaturaExcepcion e) {
                        JOptionPane.showMessageDialog(null, e.toString());
                    }
                    break;
                case 2:
                    temperatura = Integer.parseInt(JOptionPane.showInputDialog("Introduce una temperatura > 80ºC"));
                    try {
                        Conversor.CtoR(temperatura);
                    } catch (TemperaturaExcepcion e) {
                        JOptionPane.showMessageDialog(null, e.toString());
                    }
                    break;
            }
        n = Integer.parseInt(JOptionPane.showInputDialog("MENÚ:\n1. Celsius a Fahrenheit\n2. Celsius a Reamur\n3. Exit"));
        }
    }
}
