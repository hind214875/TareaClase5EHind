/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteC;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author hinda
 */
public class Ejercito {

    //atributo
    private int nSaldado;
    private Set<Soldado> ejercito;

    //constrector
    public Ejercito(int nSaldado) {
        this.ejercito = new HashSet<>();
        this.nSaldado = nSaldado;
    }

    public Ejercito(Set<Soldado> ejército) {
        this.ejercito = ejército;
    }

    //metodos
    //1. Saber el número de soldados que hay.
    public int numeroSaldados() {
        return ejercito.size();
    }

    //2. Alistar a un solado.
    public void alistarSaldado(Soldado s) {
        if (numeroSaldados() < nSaldado) {
            ejercito.add(s);
        }
    }

    //3. Saber si el ejército no tiene soldados.
    public boolean isEjercitoEmpty() {
         return ejercito.isEmpty();
    }
    

    //4. Saber si un soldado está en el ejército.
    public boolean isSaldadoExiste(Soldado s) {
        return ejercito.contains(s);
    }

    //5.Sacar todos los soldados, en forma de ArrayList.
    public ArrayList<Soldado> SacarSoldados() {
        ArrayList<Soldado> saldadosArray = new ArrayList<>();

        saldadosArray.addAll(ejercito);

        return saldadosArray;
    }

    //6.Desmatricular a un soldado del ejército.
    public void removeSaldado(Soldado s) {
        ejercito.remove(s);
    }
    
    //mostar 
    public void mostrar(){
      ejercito.forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "" + ejercito +"\n" ;
    }

    
}
