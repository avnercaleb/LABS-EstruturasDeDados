package org.map.atv2;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    private Map<String, String> dic = new HashMap<>();

    public void adicionarPalavra(String p, String d){
        dic.put(p, d);
    }

    public void remorPalavra(String p){
        dic.remove(p);
    }

    public void listarPalavras(){
        System.out.println(dic);
    }

    public void buscarPalavra(String p){
        System.out.println(dic.get(p));
    }
}
