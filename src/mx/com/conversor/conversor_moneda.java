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
public class conversor_moneda {

    //Se declaran las variables 
    private double pesos = 0.0;
    private double dolares = 0.0;
    private double euros = 0.0;
    private double libras = 0.0;
    private double yenes = 0.0;
    private double wons = 0.0;
    redondeoDosDecimales redondeos = new redondeoDosDecimales();

    public double PesoConvertir(double peso, String tipo) {

        if (tipo.contains("USD")) {
            dolares = peso / 16.89;
            dolares = redondeos.redondeo(dolares);
            return dolares;
        } else if (tipo.contains("GBP")) {
            libras = peso / 21.75;
            libras = redondeos.redondeo(libras);
            return libras;
        } else if (tipo.contains("EUR")) {
            euros = peso / 21.75;
            euros = redondeos.redondeo(euros);
            return euros;
        } else if (tipo.contains("JPY")) {
            yenes = peso * 8.30;
            yenes = redondeos.redondeo(yenes);
            return yenes;
        } else if (tipo.contains("KRW")) {
            wons = peso * 75.87;
            wons = redondeos.redondeo(wons);
            return wons;
        } else {
            return peso;
        }
    }

    public double dolarConvertir(double dolar, String tipo) {

        if (tipo.contains("MXN")) {
            pesos = dolar * 16.89;
            pesos = redondeos.redondeo(pesos);
            return pesos;
        } else if (tipo.contains("GBP")) {
            libras = dolar / 1.29;
            libras = redondeos.redondeo(libras);
            return libras;
        } else if (tipo.contains("EUR")) {
            euros = dolar / 1.11;
            euros = redondeos.redondeo(euros);
            return euros;
        } else if (tipo.contains("JPY")) {
            yenes = dolar * 140.14;
            yenes = redondeos.redondeo(yenes);
            return yenes;
        } else if (tipo.contains("KRW")) {
            wons = dolar * 1280.74;
            wons = redondeos.redondeo(wons);
            return wons;
        } else {
            return dolar;
        }
    }

    public double libraConvertir(double libra, String tipo) {

        if (tipo.contains("MXN")) {
            pesos = libra * 21.79;
            pesos = redondeos.redondeo(pesos);
            return pesos;
        } else if (tipo.contains("USD")) {
            dolares = libra * 1.29;
            dolares = redondeos.redondeo(dolares);
            return dolares;
        } else if (tipo.contains("EUR")) {
            euros = libra * 1.16;
            euros = redondeos.redondeo(euros);
            return euros;
        } else if (tipo.contains("JPY")) {
            yenes = libra * 182.15;
            yenes = redondeos.redondeo(yenes);
            return yenes;
        } else if (tipo.contains("KRW")) {
            wons = libra * 1654.29;
            wons = redondeos.redondeo(wons);
            return wons;
        } else {
            return libra;
        }
    }

    public double euroConvertir(double euro, String tipo) {

        if (tipo.contains("MXN")) {
            pesos = euro * 21.75;
            pesos = redondeos.redondeo(pesos);
            return pesos;
        } else if (tipo.contains("USD")) {
            dolares = euro * 1.11;
            dolares = redondeos.redondeo(dolares);
            return dolares;
        } else if (tipo.contains("GBP")) {
            libras = euro / 1.16;
            libras = redondeos.redondeo(libras);
            return libras;
        } else if (tipo.contains("JPY")) {
            yenes = euro * 157.62;
            yenes = redondeos.redondeo(yenes);
            return yenes;
        } else if (tipo.contains("KRW")) {
            wons = euro * 1431.49;
            wons = redondeos.redondeo(wons);
            return wons;
        } else {
            return euro;
        }
    }

    public double yenConvertir(double yen, String tipo) {

        if (tipo.contains("MXN")) {
            pesos = yen / 8.30;
            pesos = redondeos.redondeo(pesos);
            return pesos;
        } else if (tipo.contains("USD")) {
            dolares = yen / 140.14;
            dolares = redondeos.redondeo(dolares);
            return dolares;
        } else if (tipo.contains("GBP")) {
            libras = yen / 182.15;
            libras = redondeos.redondeo(libras);
            return libras;
        } else if (tipo.contains("EUR")) {
            euros = yen / 157.62;
            euros = redondeos.redondeo(euros);
            return euros;
        } else if (tipo.contains("KRW")) {
            wons = yen * 9.08;
            wons = redondeos.redondeo(wons);
            return wons;
        } else {
            return yen;
        }
    }

    public double wonConvertir(double won, String tipo) {

        if (tipo.contains("MXN")) {
            pesos = won / 75.87;
            pesos = redondeos.redondeo(pesos);
            return pesos;
        } else if (tipo.contains("USD")) {
            dolares = won / 1280.74;
            dolares = redondeos.redondeo(dolares);
            return dolares;
        } else if (tipo.contains("GBP")) {
            libras = won / 1654.29;
            libras = redondeos.redondeo(libras);
            return libras;
        } else if (tipo.contains("EUR")) {
            euros = won / 1431.49;
            euros = redondeos.redondeo(euros);
            return euros;
        } else if (tipo.contains("JPY")) {
            yenes = won / 9.08;
            yenes = redondeos.redondeo(yenes);
            return yenes;
        } else {
            return won;
        }
    }

}
