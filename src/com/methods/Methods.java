/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.methods;

/**
 *
 * @author erichaag
 */
public class Methods {
    
       
     public static int[] llenar_automatico(int v[]){
        for (int i = 0; i < v.length; i++) {
            v[i] = (int) (Math.random() * 9) + 1;
        }
        return v;
    }
    
    public static String mostrar(int v[]){
        String aux ="";
        for (int i = 0; i < v.length; i++) {
            aux = aux + v[i]+ " ";
        }
        return aux;
    }
    
    public static double promedio(int v[]){
        double acum=0;
        for (int i = 0; i < v.length; i++) {
            acum = acum + v[i];
        }
        return acum /v.length;       
    }
    
    public static int mayor_valor(int v[]){
        int mayor = v[0];
        for (int i = 0; i < v.length; i++) {
            if(v[i]> mayor){
                mayor= v[i];
            }
        }
        return mayor;
    }
    
}
