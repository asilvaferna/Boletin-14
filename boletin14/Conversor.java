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
public class Conversor {
    private final static int TCELSIUS = 80;
    
    public static double CtoF (float temperatura) throws TemperaturaExcepcion{
        if (temperatura < TCELSIUS) {
            throw new TemperaturaExcepcion();
        }
        return temperatura * 1.8 + 32.4;    
    }
    public static void CtoR(float temperatura) throws TemperaturaExcepcion{
        if (temperatura < TCELSIUS){
            throw new TemperaturaExcepcion();
        }
        double resultado;
        resultado = (4.0/5.0) * temperatura;
        System.out.println(resultado + "ºRE");
    }
}
