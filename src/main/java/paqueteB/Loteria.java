/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteB;

import java.util.HashMap;
import java.util.Map;
 

/**
 *
 * @author hinda
 */
public class Loteria {

    //atributos 
    private Map<String, Premio> decimos;

    public Loteria() {
        this.decimos = new HashMap<>();
        insertar();
    }

    public Loteria(Map<String, Premio> decimos) {
        this.decimos = decimos;
    }

    public void mostrar() {
        for (String key : decimos.keySet()) {
            System.out.printf("Clave: %s -- Objeto: %s %n", key, decimos.get(key));
        }
    }

   

    //metodo que no recibe nada y no devuelve nada solo genera el num con zeros a la izquierda  
    private void insertar() {
        for (int i = 0; i <= 1000; i++) {
            String num;
            if (i <= 9) {
                num = "000" + i;
            } else if (i <= 99) {
                num = "00" + i;
            } else if (i <= 999) {
                num = "0" + i;
            } else {
                num = "" + i;
            }

            decimos.put(num, Premio.generarPremioAleatorio());
        }

    }

    //consultar el premio que ha salido, lo pasamos el clave y si exsite devolvemos su premio aleatorio
    public Premio consultarPremio(String decimo) {
        if (decimos.containsKey(decimo)) {
            return decimos.get(decimo);
        }
        return null;
    }

}
