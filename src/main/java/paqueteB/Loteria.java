/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 *
 * @author hinda
 */
public class Loteria {

    //atributos
    private ArrayList<String> premio=new ArrayList<String>(Arrays.asList("Viaje", "Moneda", "Auto"));
    private Map<String, ArrayList<String>> decimos;

    public Loteria() {
        this.decimos = new HashMap<>();
        insertar();
    }

    public Loteria(ArrayList<String> premio, Map<String, ArrayList<String>> decimos) {
        this.premio = premio;
        this.decimos = decimos;
    }

    public void mostrar() {
        for (String key : decimos.keySet()) {
            System.out.printf("Clave: %s -- Objeto: %s %n", key, decimos.get(key));
        }
    }

    private String generarPremio() {
        Random rd = new Random();
        int randomitem = rd.nextInt(premio.size());
        String posibilidad = premio.get(randomitem);

        return posibilidad;
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

    public Integer consultarPremio(String decimo) {
        if (decimos.containsKey(decimo)) {
            return decimos.get(decimo);
        }
        return -1;
    }

}
