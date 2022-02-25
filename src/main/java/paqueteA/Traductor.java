/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteA;

import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author hinda
 */
public class Traductor {

    //atributos
    private Map<String, String> traductor;

    //constrector
    public Traductor() {
        this.traductor = new TreeMap<>();
    }

    public Traductor(Map<String, String> traductor) {
        this.traductor = traductor;
    }

    //getters y setters 
    public Map<String, String> getTraductor() {
        return traductor;
    }

    public void setTraductor(Map<String, String> traductor) {
        this.traductor = traductor;
    }

    //metodos
    public void añadirNuevaPalabra(String traduEng, String PalabraEsp) {
        traductor.put(traduEng, PalabraEsp);
    }

    //borrar entradas
    public void borrarPlabra(String clave) {
        // Borra el par clave/valor de la clave que se le pasa como parámetro
        traductor.remove(clave);
    }

    //modificar palabra
    public void modificarPlabra(String clave, String nuevoValor) {
        if (traductor.get(clave) != null) {//get devuelve null si el clave no existe
            traductor.replace(clave, nuevoValor);
        }
    }

    // realizar la traducción de una palabra inglesa dada.
    public String traducirPlabraInglesa(String PalabraInglesa) {
        return traductor.get(PalabraInglesa);//devuelve null si el clave no existe
    }

    //crear una lista de palabras en inglés
    public Set<String> listaPalabrasIngles() {
        //con keySet(): Se puede obtener un Set con las claves únicas
        Set<String> palabrasIngles = traductor.keySet();
        return palabrasIngles;
    }
    
    //crear una lista para palabras en español
    public Collection<String> plabrasEspañol(){
        //values(): Devuelve una "Collection" con los valores del Map
        Collection<String> plabrasEsp=traductor.values();
       return plabrasEsp;
    }

    //mostrar hashMap
    public void mostrar() {
        for (String key : traductor.keySet()) {
            System.out.printf("Clave: %s -- Objeto: %s %n", key, traductor.get(key));
        }
    }

    //toString
    @Override
    public String toString() {
        return "Traductor{" + "traductor=" + traductor + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.traductor);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Traductor other = (Traductor) obj;
        if (!Objects.equals(this.traductor, other.traductor)) {
            return false;
        }
        return true;
    }

}
