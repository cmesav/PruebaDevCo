package com.travelocity.utils;

import java.util.ArrayList;

public class MenorValor {

    public static int enHotel(ArrayList<String> values) {
        int indice=0;
        double prueba = Double.parseDouble(values.get(0));
        for (int i = 0; i < values.size(); i++) {
            if (prueba >= Double.parseDouble(values.get(i))){
                prueba = Double.parseDouble(values.get(i));
                indice =i;
            }
        }
        return indice+1;
    }
}
