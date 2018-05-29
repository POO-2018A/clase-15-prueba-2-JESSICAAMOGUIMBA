/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudiantes;

import java.util.*;


public class Estudiante {
private String nombre;
private int edad;
private String[] materias;// el tamaño de los arreglos son estaticos

//constructor clic der. insrte code .seleccionamos lo q contendra
//permite pasar los valores a PRINCIPAL

    public Estudiante(String nombre,int edad) {
        this.nombre = nombre;
        this.edad = edad;
        
    }
   
// GET Y SET

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String []getMaterias() {
        return materias;
    }

    public void setMaterias(String [] materias) {
        this.materias = materias;
    }

    // METODO TO STRING
    @Override
    public String toString() {
      
        
        
        
        return "Se ha ingresado el Estudiante{" +
                "nombre=" + nombre +
                ", edad=" + edad + 
                ", materias=" + materias + '}';
    }
 //METODO EQUALS
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.nombre);
        hash = 37 * hash + this.edad;
        hash = 37 * hash + Arrays.deepHashCode(this.materias);
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
        final Estudiante other = (Estudiante) obj;
        if (this.edad != other.edad) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Arrays.deepEquals(this.materias, other.materias)) {
            return false;
        }
        return true;
    }

   


    

}
