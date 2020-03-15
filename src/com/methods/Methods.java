/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.methods;

import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Bnieto
 */
public class Methods {

    // llenar valor automatio
    public static int[] llenar_automatico(int v[]) {
        for (int i = 0; i < v.length; i++) {
            v[i] = (int) (Math.random() * 20) + 1;
        }
        return v;
    }
    // llenar valor manual

    public static int[] llenar_manual(int v[]) {
        for (int i = 0; i < v.length; i++) {
            String num = JOptionPane.showInputDialog("Digite el valor de la posición " + (i + 1) + " de " + v.length + "");
            v[i] = Integer.parseInt(num);
        }
        return v;
    }
    // imprimir vector

    public static String mostrar(int v[]) {
        String aux = "";
        for (int i = 0; i < v.length; i++) {
            aux = aux + v[i] + " ";
        }
        return aux;
    }
    // promedio de valores de un vector

    public static double promedio(int v[]) {
        double acum = 0;
        for (int i = 0; i < v.length; i++) {
            acum = acum + v[i];
        }
        return acum / v.length;
    }
    // mayor valor de un vector

    public static int mayor_valor(int v[]) {
        int mayor = v[0];
        for (int i = 0; i < v.length; i++) {
            if (v[i] > mayor) {
                mayor = v[i];
            }
        }
        return mayor;
    }
    // suma de valores de 1 solo vector

    public static int sumatoria(int[] v) {
        int aux = 0;
        for (int i = 0; i < v.length; i++) {
            aux += v[i];
        }
        return aux;
    }
    // productoria de valores de 1 solo vector

    public static int productoria(int[] v) {
        int aux = 1;
        for (int i = 0; i < v.length; i++) {
            aux = (aux * v[i]);
        }
        return aux;
    }

    // menor valor 
    public static int menor_q(int[] v) {
        int aux = v[0];
        for (int i = 0; i < v.length; i++) {
            if (v[i] < aux) {
                aux = v[i];
            }
        }
        return aux;
    }
    // valores pares

    public static int par(int[] v) {
        int count = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    // valores impares
    public static int impar(int[] v) {
        int count = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] % 2 == 1) {
                count++;
            }
        }
        return count;
    }

    // valores primos
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

    // suma de valores de 2 vectores
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

    // resta de valores de 2 vectores
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

    // **cual** numero se repite en el vector
    public static int cual_repite(int[] v) {

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

    // **cuantas** veces se repite el numero que mas se repite en el vector
    public static int cuantas_repite(int[] v, int eval) {
        int count = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] == eval) {
                count++;
            }
        }
        return count;
    }

    public static int[] union(int[] v1, int[] v2) {

        int[] Runion = new int[v1.length + v2.length];
        //System.out.println(Runion.length); // suma de los 2 vectores para hayar el tamaño
        //System.out.println("===================================");
        for (int i = 0; i < Runion.length; i++) {
            if (i < v1.length) {
                Runion[i] = v1[i];
                // System.out.print("v1 ");
                // System.out.println(i + "-" + Runion[i]);
            } else {
                for (int j = 0; j < v2.length; j++) {
                    Runion[i] = v2[j];
                    // System.out.print("v2 ");
                    // System.out.println(i + "-" + Runion[i]);
                    i++;
                }
            }
        }
        return Runion;
    }

    public static int[] union_nrepeat(int[] union) {

        int[] nuevo_conjunto = new int[union.length];
        int temp;
        for (int i = 0; i < nuevo_conjunto.length; i++) {
            nuevo_conjunto = bubble(union);
            for (int k = 1; k < nuevo_conjunto.length; k++) { // otorga 0
                for (int h = 0; h < nuevo_conjunto.length - 1; h++) {
                    if (nuevo_conjunto[h] == nuevo_conjunto[h + 1]) {
                        temp = nuevo_conjunto[h];
                        nuevo_conjunto[h] = nuevo_conjunto[h + 1];
                        nuevo_conjunto[h + 1] = 0;
                    }
                }
            }
        }
        int cual = cual_repite(nuevo_conjunto);
        int cuanto = cuantas_repite(nuevo_conjunto, cual);
        int new_tam = nuevo_conjunto.length - cuanto;
        int plus = cuanto;
        //System.out.println("El " + cual + " se repite " + cuanto + " veces");
        //System.out.println("nuevo tamaño es " + new_tam);
        int[] nuevo_conjunto2 = new int[new_tam];
        for (int i = 0; i < nuevo_conjunto2.length; i++) {
            if (i < new_tam) {
                nuevo_conjunto2[i] = nuevo_conjunto[plus];
                plus++;
            }

        }
        // System.out.println(Arrays.toString(nuevo_conjunto2));
        // borrar espacio
        return nuevo_conjunto2;
    }

    public static int[] intersection(int[] v1, int[] v2) {

        // maximo valor de los vectores unidos
        String result = null;
        String aux = "";
        int count = 0;
        for (int i = 0; i < v1.length; i++) {
            //    System.out.println("Evalues valor:" + v1[i]);
            for (int j = 0; j < v2.length; j++) {
                //      System.out.println("si elemento v2 en " + j + " es igual a" + v1[j]);
                if (v2[j] == v1[i]) { // esta
                    //           System.out.println("Es igual adicionamos:");
                    aux = +v2[j] + "," + aux;
                    count++;
                }
            }
        }
        //    System.out.println(aux);

        if ((aux != null) && (aux.length() > 0)) {
            result = aux.substring(0, aux.length() - 1);
        }
        //    System.out.println(result);
        int[] maxval = new int[count];

        // string with command x,x,x to array 
        List<String> items = Arrays.asList(result.split("\\s*,\\s*"));
        for (int i = 0; i < items.size(); i++) {
            //        System.out.println(items.get(i));
            maxval[i] = Integer.parseInt(items.get(i));
        }
        return union_nrepeat(maxval);
    }
    
    // FALTA
    public static int[] difference(int[] v1,int[] v2){
        
        return v1;
    }

    /// ==== SORT METHOD
    public static int[] bubble(int[] matrix) {
        int temp;
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length - 1; j++) {
                if (matrix[j] > matrix[j + 1]) {
                    temp = matrix[j];
                    matrix[j] = matrix[j + 1];
                    matrix[j + 1] = temp;
                }
            }
        }
       // System.out.println("1. Metodo burbuja");
       // System.out.println(Arrays.toString(matrix));

        return matrix;
    }

}
