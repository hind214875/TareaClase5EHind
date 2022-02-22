/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteC;

import java.util.Objects;

/**
 *
 * @author hinda
 */
public class Soldado implements Comparable<Soldado>{
    
    private String nif;
    private String nombre;
    private String appelido1;
    private String appelido2;
    private int edad;
    
    //constrector
    public Soldado() {
    }

    //constrector parametrizado
    public Soldado(String nif, String nombre, String appelido1, String appelido2, int edad) {
        this.nif = nif;
        this.nombre = nombre;
        this.appelido1 = appelido1;
        this.appelido2 = appelido2;
        this.edad = edad;
    }
    
    //getters y setters
    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAppelido1() {
        return appelido1;
    }

    public void setAppelido1(String appelido1) {
        this.appelido1 = appelido1;
    }

    public String getAppelido2() {
        return appelido2;
    }

    public void setAppelido2(String appelido2) {
        this.appelido2 = appelido2;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    //toString
    @Override
    public String toString() {
        return "\nSoldado{" + "nif=" + nif + " nombre=" + nombre + " appelido1=" + appelido1 + " appelido2=" + appelido2 + " edad=" + edad + '}'+"\n";
    }
    
    //equals y hashcode

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.nif);
        hash = 97 * hash + Objects.hashCode(this.nombre);
        hash = 97 * hash + Objects.hashCode(this.appelido1);
        hash = 97 * hash + Objects.hashCode(this.appelido2);
        hash = 97 * hash + this.edad;
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
        final Soldado other = (Soldado) obj;
        return Objects.equals(this.nif, other.nif);
    }

    @Override
    public int compareTo(Soldado soldado) {
        return this.nif.compareTo(soldado.nif);
    }

    
}
