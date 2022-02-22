/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteC;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author hinda
 */
public class MapEjercitos {

    public static void main(String[] args) {
        //crear y initializar ejercito
        Ejercito e = new Ejercito(5);
        e.alistarSaldado(new Soldado("1235J", "soldado1", "apellido", "apellido", 30));
        e.alistarSaldado(new Soldado("1235B", "soldado2", "apellido", "apellido", 29));
        e.alistarSaldado(new Soldado("8695M", "soldado3", "apellido", "apellido", 35));
        e.alistarSaldado(new Soldado("8564H", "soldado4", "apellido", "apellido", 20));
        e.alistarSaldado(new Soldado("2314C", "soldado5", "apellido", "apellido", 28));

        Ejercito e1 = new Ejercito(4);
        e1.alistarSaldado(new Soldado("56864H", "soldado1", "apellido", "apellido", 20));
        e1.alistarSaldado(new Soldado("69829G", "soldado2", "apellido", "apellido", 21));
        e1.alistarSaldado(new Soldado("96542Ñ", "soldado3", "apellido", "apellido", 22));
        e1.alistarSaldado(new Soldado("25786F", "soldado4", "apellido", "apellido", 23));

        //crear HashMap de ejercitos
        Map<String, Ejercito> ejercitos = new HashMap<>();

        ejercitos.put("Ej1", e);
        ejercitos.put("Ej2", e1);
        ejercitos.put("Ej3", e);
        ejercitos.put("Ej4", e1);

        //obtener un Ejercito según su nombre 
        System.out.println("obtener un Ejercito según su nombre :\n ");
        ejercitos.get("Ej1").mostrar();

        //obtener todos los Ejércitos contenidos en la estructura map.
        System.out.println("\nobtener todos los ejercitos:");
        for (String key : ejercitos.keySet()) {
            System.out.printf("Clave: %s -- Objeto: %s %n", key, ejercitos.get(key));
        }

        //mostrar si este clave existe en la estrectura map
        System.out.println("este clave existe? " + ejercitos.containsKey("Ej1"));

        //this methos putIfAbsent only if no such key exists 
        //un valor nulo (si no había una asignación con la clave proporcionada antes o se asignó a un valor nulo
        ejercitos.putIfAbsent("Ej5", e1);
       

    }
}
