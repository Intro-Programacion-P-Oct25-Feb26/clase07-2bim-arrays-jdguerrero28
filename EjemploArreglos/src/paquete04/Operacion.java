/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

/**
 *
 * @author reroes
 */
public class Operacion {

    public static double[] obtenerPromedioSemanal(int[][] pedidos) {
        double[] promedios = new double[8];
        int suma;
        double promedio;
        for (int i = 0; i < pedidos.length; i++) {
            suma = 0;
            for (int j = 0; j < pedidos[i].length; j++) {
                suma = suma + pedidos[i][j];
            }
            promedio = (double) suma / 7;
            promedios[i] = promedio;
        }

        return promedios;
    }
    /*
    Dentro de la funcion ObtenerPromedioSemanal se recibe como argumento un arr-
    eglo bidimensional de enteros y se calcula los promedios de cada cafeteria
    y se los guarda en otro arreglo unidimensional de decimales.
    */

    public static int obtenerSumaTotal(int[][] pedidos) {

        int suma = 0;
        for (int i = 0; i < pedidos.length; i++) {

            for (int j = 0; j < pedidos[i].length; j++) {
                suma = suma + pedidos[i][j];
            }

        }

        return suma;
    }
    /*
    Dentro de la funcion obtenerSumaTotal se recibe un arreglo bidimensional de 
    enteros y se devuelve una suma de todas las posiciones del arreglo pedidos.
    */

    public static int[] obtenerSumaSemanal(int[][] pedidos) {
        int[] sumaSemanal = new int[8];
        int suma;
        for (int i = 0; i < pedidos.length; i++) {
            suma = 0;
            for (int j = 0; j < pedidos[i].length; j++) {
                suma = suma + pedidos[i][j];
            }
            sumaSemanal[i] = suma;
        }

        return sumaSemanal;
    }
    /*
    En la funcion obtenerSumaSemanal se recibe un arreglo bidimensional y tambi-
    en se crea otro arreglo unidimensional en donde se va a guardar la suma se-
    manal de cada cafeteria.
    */

    public static int obtenerMenor(int[] pedidosCafeteria) {
        int menor = pedidosCafeteria[0];
        int valor;
        for (int i = 0; i < pedidosCafeteria.length; i++) {
            valor = pedidosCafeteria[i];
            if (valor < menor) {
                menor = valor;
            }
        }
        return menor;
    }
    /*
    La funcion obtenerMenor recibe un arreglo unidimensional donde estan los to-
    tales de cada dia y retorna el valor menor de ellos.
    */

    public static int obtenerMayor(int[] pedidosCafeteria) {
        int mayor = pedidosCafeteria[0];
        int valor;
        for (int i = 0; i < pedidosCafeteria.length; i++) {
            valor = pedidosCafeteria[i];
            if (valor > mayor) {
                mayor = valor;
            }
        }
        return mayor;
    }
    /*
    La funcion obtenerMenor recibe un arreglo unidimensional donde estan los to-
    tales de cada dia y retorna el valor mayor de ellos.
    */
}
