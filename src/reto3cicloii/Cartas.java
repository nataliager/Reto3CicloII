

/**
 * <p>Copyright: Copyright (c) 2019</p>
 *
 * <h3>License</h3>
 *
 * Copyright (c) 2019 by Natalia Andrea Giraldo Erazo. <br>
 * All rights reserved. <br>
 *
 * <p>Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 * <ul>
 * <li> Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 * <li> Redistributions in binary form must reproduce the above copyright notice,
 * this list of conditions and the following disclaimer in the documentation
 * and/or other materials provided with the distribution.
 * <li> Neither the name of the copyright owners, their employers, nor the
 * names of its contributors may be used to endorse or promote products
 * derived from this software without specific prior written permission.
 * </ul>
 * <p>THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNERS OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 * Reto 3 Ciclo II misión TIC 2022 
 * @version 1.0
 * 
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
