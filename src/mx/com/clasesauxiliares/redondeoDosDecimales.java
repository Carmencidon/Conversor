/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.clasesauxiliares;

/**
 *
 * @author La inge
 */
public class redondeoDosDecimales {
    
    
    
    public double redondeo (double cantidad){
    
        double redondeo=0.0;
        
        redondeo = Math.round(cantidad*10000.0)/10000.0;
        return redondeo;
    }
    
}
