/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteB;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;


/**
 *
 * @author hinda
 */
public class Loteria {

    //atributos
    private Map<String, Integer> decimos;

    public Loteria() {
        this.decimos = new HashMap<>();
    }

    public Loteria(Map<String, Integer> decimos) {
        this.decimos = decimos;
        insertar();
    }

    public void mostrar() {
        for (String key : decimos.keySet()) {
            System.out.printf("Clave: %s -- Objeto: %s %n", key, decimos.get(key));
        }
    }

    private int generarPremio() {
        Random rd = new Random();
        int posibilidad = rd.nextInt(50);
        int premio;

        if (posibilidad == 50) {
            premio = 100_000_000;
        } else if (posibilidad >= 45 && posibilidad < 50) {
            premio = 50_000_000;
        } else if (posibilidad >= 30 && posibilidad < 45) {
            premio = 10_000;
        } else if (posibilidad >= 20 && posibilidad < 30) {
            premio = 500;
        } else if (posibilidad > 10 && posibilidad < 20) {
            premio = 50;
        } else {
            premio = 0;
        }

        return premio;
    }

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

            decimos.put(num, generarPremio());
        }

    }
    
    public Integer consultarPremio(String decimo){
        if(decimos.containsKey(decimo)){
            return decimos.get(decimo);
        }
        return -1;
    }
    
    

}
