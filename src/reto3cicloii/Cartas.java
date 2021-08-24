/**
 * Reto 3 Ciclo II misión TIC 2022 
 * @author Natalia Giraldo  
 */
//package reto3cicloii;

import java.util.*;

public class Cartas {

    public static ArrayList<Integer> rarezas(ArrayList<Integer> lista) {
        ArrayList<Integer> rarezas = new ArrayList<Integer>();
        for (int i = 0; i < lista.size(); i++) {
            if (rarezas.contains(lista.get(i))) {
                //System.out.println("esta");
            } else {
                rarezas.add(lista.get(i));
            }
        }
        return rarezas;
    }

    public static ArrayList<Integer> meFaltanDeLaRareza(ArrayList<Integer> indices, 
            ArrayList<Integer> cartas,int num){
        ArrayList<Integer> meFaltan = new ArrayList<Integer>();
        for (int i = 0; i < indices.size(); i++) {
            if (cartas.get(indices.get(i)).equals(num)) {
                meFaltan.add(indices.get(i));
            }
        }
        return meFaltan;
    }

    public static ArrayList<Integer> noTengo(ArrayList<Integer> cartasPersona, 
            ArrayList<Integer> cartasYugui) {
        ArrayList<Integer> notengo = new ArrayList<>();
        for (int element : cartasPersona) {
            if (!cartasYugui.contains(element)) {
                notengo.add(element);
                
            }
        }
        return notengo;
    }

    public static Integer puedoCambiar(ArrayList<Integer> cartasPersona,
            ArrayList<Integer> cartasYugui) {
        List<Integer> canChange = new ArrayList<Integer>(cartasPersona);
        canChange.retainAll(cartasYugui);
        return Math.min(Math.abs(cartasYugui.size()-canChange.size()),
                noTengo(cartasPersona,cartasYugui).size());  
    }
}
