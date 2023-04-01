/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva2_24_collections;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 *
 * @author eduar
 */
public class EVA2_24_COLLECTIONS {

    public static void main(String[] args) {
        //COLLECTIONS <---- son contenedores
        ArrayList miArreglo = new ArrayList();
        miArreglo.add(new Persona());
        miArreglo.add(new automovil());
        miArreglo.add(new perro());
        
        ArrayList<Integer> miArreglo2 = new ArrayList<Integer>();
        miArreglo2.add(100);
        miArreglo2.add(200);
        miArreglo2.add(300);
        miArreglo2.add(400);
        System.out.println(miArreglo2);
    }
}
class Persona{
    
}
class automovil{
    
}
class perro{
    
}
