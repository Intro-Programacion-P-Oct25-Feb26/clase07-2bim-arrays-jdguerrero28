/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete05;
import paquete04.Operacion;

/**
 *
 * @author reroes
 */
public class Informe {
    
    public static int obtenerTotalDia(int [][] pedidos, int dia){
        
        int suma = 0;
        for (int i = 0; i < pedidos.length; i++) {
            suma = suma + pedidos[i][dia-1];
        }
        return suma;
    }
    /*
    La funcion obtenerTotalDia va a recibir un arreglo bidimensional de los pe-
    didos y un valor entero "3" que va a retornar la suma de los pedidos del dia
    miercoles
    */
    
    public static String obtenerCafeteriaMasPedidos(int [][] pedidos, String[] cafeterias){
        
        int [] sumaSemanal = Operacion.obtenerSumaSemanal(pedidos);
        
        int mayor = sumaSemanal[0];
        int indice = 0;
        for (int i = 0; i < sumaSemanal.length; i++) {
            int valor = sumaSemanal[i];
            
            if (valor > mayor){
                mayor = valor;
                indice = i;
            }
        }
        
        return cafeterias[indice];
    /*
    Dentro de la funcion obtenerCafeteriaMasPedidos se va a recibir un arreglo 
    bidimensional de enteros y un unidimensional de cadenas que van a ser usados
    para retornar la caferia con mas pedidos a partir de lo que se retorno en 
    la funcion obtenerSumaSemanal.
    */
        
    }
    
    public static int [] obtenerMenorPedidoCafeteria(int [][] pedidos){
        int [] pedidosMenores = new int[8];
        
        for (int i = 0; i < pedidos.length; i++) {
            pedidosMenores[i] = Operacion.obtenerMenor(pedidos[i]);
        }
        
        return pedidosMenores;
    
    }
    /*
    Dentro de la funcion obtenerMenorPedidoCafeteria se va a recibir un arreglo 
    bidimensional de enteros que va a ser usado para retornar un arreglo 
    unidimensional con los pedidos mas bajos de cada cafeteria a partir de lo 
    que se retorno en la funcion Operacion.obtenerMenor.
    */    
    public static int [] obtenerMayorPedidoCafeteria(int [][] pedidos){
        int [] pedidosMayores = new int[8];
        
        for (int i = 0; i < pedidos.length; i++) {
            pedidosMayores[i] = Operacion.obtenerMayor(pedidos[i]);
        }
        
        return pedidosMayores;
    }
    /*
    Dentro de la funcion obtenerMayorPedidoCafeteria se va a recibir un arreglo 
    bidimensional de enteros que va a ser usado para retornar un arreglo 
    unidimensional con los pedidos mas altos de cada cafeteria a partir de lo 
    que se retorno en la funcion Operacion.obtenerMayor.
    */    
    
    
}
