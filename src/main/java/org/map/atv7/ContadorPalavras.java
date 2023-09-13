package org.map.atv7;

import java.util.HashMap;

public class ContadorPalavras {

    public HashMap<String, Integer> contarPalavras(String texto){
        HashMap<String, Integer> mapa = new HashMap<>();

        for(String p : texto.split(" ")){
            if(mapa.get(p) != null){
                mapa.put(p, mapa.get(p) + 1);
            } else {
                mapa.put(p, 1);
            }
        }

        return mapa;
    }
}
