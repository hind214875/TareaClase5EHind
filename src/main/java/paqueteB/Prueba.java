/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteB;

/**
 *
 * @author hinda
 */
public class Prueba {

    public static void main(String[] args) {
        Loteria l = new Loteria();

       // l.mostrar();
        System.out.println("tu premio es: " + l.consultarPremio("0100"));
    }
}
