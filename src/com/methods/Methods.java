/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.methods;

import javax.swing.JOptionPane;

/**
 *
 * @author erichaag
 */
public class Methods {

    public static int[] llenar_automatico(int v[]) {
        for (int i = 0; i < v.length; i++) {
            v[i] = (int) (Math.random() * 20) + 1;
        }
        return v;
    }

    public static int[] llenar_manual(int v[]) {
        for (int i = 0; i < v.length; i++) {
            String num = JOptionPane.showInputDialog("Digite el valor de la posición " + (i + 1) + " de " + v.length + "");
            v[i] = Integer.parseInt(num);
        }
        return v;
    }

    public static String mostrar(int v[]) {
        String aux = "";
        for (int i = 0; i < v.length; i++) {
            aux = aux + v[i] + " ";
        }
        return aux;
    }

    public static double promedio(int v[]) {
        double acum = 0;
        for (int i = 0; i < v.length; i++) {
            acum = acum + v[i];
        }
        return acum / v.length;
    }

    public static int mayor_valor(int v[]) {
        int mayor = v[0];
        for (int i = 0; i < v.length; i++) {
            if (v[i] > mayor) {
                mayor = v[i];
            }
        }
        return mayor;
    }

    public static int sumatoria(int[] v) {
        int aux = 0;
        for (int i = 0; i < v.length; i++) {
            aux += v[i];
        }
        return aux;
    }

    public static int productoria(int[] v) {
        int aux = 1;
        for (int i = 0; i < v.length; i++) {
            aux = (aux * v[i]);
        }
        return aux;
    }

    public static int mayor_q(int[] v) {
        int aux = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] > aux) {
                aux = v[i];
            }
        }
        return aux;
    }

    public static int menor_q(int[] v) {
        int aux = v[0];
        for (int i = 0; i < v.length; i++) {
            if (v[i] < aux) {
                aux = v[i];
            }
        }
        return aux;
    }

    public static int par(int[] v) {
        int count = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] %2==0) {
                count ++;
            }
        }
        return count;
    }

    public static int impar(int[] v) {
       int count = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] %2==1) {
                count ++;
            }
        }
        return count;
    }

}
