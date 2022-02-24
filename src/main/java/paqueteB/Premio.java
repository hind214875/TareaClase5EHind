/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteB;

import java.util.Random;

/**
 *
 * @author hinda
 */
public enum Premio {
    AUTO("MercedesA1",1300.00),
    VIAJE("Maldiva",30000),
    DINERO("regalo",100000),
    NADA("nada",00);
    
    private String desc;
    private double valor;
    
    //
    private Premio(String desc,double valor){
        this.desc=desc;
        this.valor=valor;
    }

    public String getDesc() {
        return desc;
    }

    public double getValor() {
        return valor;
    }
    
     public static Premio generarPremioAleatorio() {
        Random rd = new Random();
        Premio[] values = Premio.values();
        int size = values.length;
        return values[rd.nextInt(size)];

    }
    
}
