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
            if (v[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int impar(int[] v) {
        int count = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] % 2 == 1) {
                count++;
            }
        }
        return count;
    }

    public static int primos(int[] v) {
        int init = 0, pri = 0, count = 0;
        for (int i = 0; i < v.length; i++) {
            init = v[i];
            for (int j = 2; j < init; j++) {
                if (init % j == 0) {
                    count++;
                }
            }
            if (count < 2) {
                pri++;
                i++;
            }

        }
        return pri;
    }

    public static int[] sumvectors(int[] v1, int[] v2) {
        int[] totalsum = new int[v1.length];
        //     int[] totalres = new int[v1.length];

        int val1 = 0, val2 = 0;
        for (int i = 0; i < totalsum.length; i++) {
            val1 = v1[i];
            val2 = v2[i];
            totalsum[i] = (val1 + val2);
            //      totalres[i] = (val1 - val2);
        }

        return totalsum;
    }

    public static int[] restvectors(int[] v1, int[] v2) {

        int[] totalres = new int[v1.length];

        int val1 = 0, val2 = 0;
        for (int i = 0; i < totalres.length; i++) {
            val1 = v1[i];
            val2 = v2[i];
            totalres[i] = (val1 - val2);
        }

        return totalres;
    }

    public static int cuan_repite(int[] v) {

        int memori = 0, eval = 0, repite = 0;
        for (int i = 0; i < v.length; i++) {
            eval = v[i];
            int vecesrepite = 0;
            for (int j = 0; j < v.length; j++) {
                if (eval == v[j]) {
                    vecesrepite++;
                    memori = v[j];
                }
                if (vecesrepite >= 2) {
                    repite = memori;

                }
            }
        }
        return repite;
    }

    public static int count_repite(int[] v, int eval) {
        int count = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] == eval) {
                count++;
            }
        }
        return count;
    }
    
    public static int[] union(int[] v1,int[] v2) {
        
        int[] Runion = new int[v1.length+v2.length];
        
        
        return Runion;
    }
}
