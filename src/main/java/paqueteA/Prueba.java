/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteA;

import java.util.Arrays;

/**
 *
 * @author hinda
 */
public class Prueba {

    public static void main(String[] args) {
        Traductor t1 = new Traductor();

        t1.añadirNuevaPalabra("day", "día");
        t1.añadirNuevaPalabra("work", "trabajo");
        t1.añadirNuevaPalabra("make", "hacer");
        t1.añadirNuevaPalabra("good", "bueno");
        t1.añadirNuevaPalabra("people", "gente");
        t1.añadirNuevaPalabra("know", "saber");
        t1.añadirNuevaPalabra("acknowledge", "reconocer");
        t1.añadirNuevaPalabra("advantage", "ventaja");
        t1.añadirNuevaPalabra("gorgeous", "precioso");
        t1.añadirNuevaPalabra("youth", "juventud");
        
        //muestra lista palabras Ingles
        t1.listaPalabrasIngles().forEach(System.out::println);
        
        //muestra lista palabras Español
        System.out.println("\npalabras españoles: ");
        t1.plabrasEspañol().forEach(System.out::println);
        
        //borrar palabra 
        t1.borrarPlabra("day");
        System.out.println("\ndespues de borar palabra day");
        t1.mostrar();
        
        
        //modificar
        System.out.println("\nModificar \n");
        t1.modificarPlabra("work","ocupación");
        t1.mostrar();
        
        //traducirPlabraInglesa
        System.out.println("\ntraducir una palabra: ");
        System.out.println(t1.traducirPlabraInglesa("acknowledge"));

    }
}
