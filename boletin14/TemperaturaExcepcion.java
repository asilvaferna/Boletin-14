/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin14;

/**
 *
 * @author Adri
 */
public class TemperaturaExcepcion  extends Exception{

    public TemperaturaExcepcion() {
        super("No puede ser menor de 80ºC");
    }

    public TemperaturaExcepcion(String message) {
        super(message);
    }
    
}
