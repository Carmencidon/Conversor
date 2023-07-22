/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.conversor;

import mx.com.clasesauxiliares.redondeoDosDecimales;

/**
 *
 * @author La inge
 */
public class conversor_temperatura {

    private double celcius = 0.0;
    private double farenhei = 0.0;
    private double kelvin = 0.0;
    redondeoDosDecimales redondeos = new redondeoDosDecimales();

    public double celsiusConvertir(double grado, String tipo) {

        if (tipo.contains("F")) {
            farenhei = (grado * 1.8) + 32;
            farenhei = redondeos.redondeo(farenhei);
            return farenhei;
        } else if (tipo.contains("K")) {
            kelvin = grado + 273.15;
            kelvin = redondeos.redondeo(kelvin);
            return kelvin;
        } else {
            return grado;
        }
    }

    public double farenheiConvertir(double grado, String tipo) {

        if (tipo.contains("C")) {
            celcius = (grado - 32) / 1.8 ;
            celcius = redondeos.redondeo(celcius);
            return celcius;
        } else if (tipo.contains("K")) {
            kelvin = (grado - 32) * 5/9 + 273.15;
            kelvin = redondeos.redondeo(kelvin);
            return kelvin;
        } else {
            return grado;
        }
    }
    public double kelvinConvertir(double grado, String tipo) {

        if (tipo.contains("F")) {
            farenhei = (1.8*(grado-273.15))+32;
            farenhei = redondeos.redondeo(farenhei);
            return farenhei;
        } else if (tipo.contains("C")) {
            celcius = grado - 273.15;
            celcius = redondeos.redondeo(celcius);
            return celcius;
        }else {
            return grado;
        }
    }
}
