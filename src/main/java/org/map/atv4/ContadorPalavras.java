package org.map.atv4;

import java.util.HashMap;
import java.util.Map;

public class ContadorPalavras {

    private Map<String, Integer> palavras = new HashMap<>();

    public void addPalavra(String p, Integer c){
        palavras.put(p, c);
    }

    public void removerPalavra(String p){
        palavras.remove(p);
    }

    public Integer contagemTotal(){
        Integer count = 0;

        for(Map.Entry<String, Integer> entry : palavras.entrySet()){
            count += entry.getValue();
        }

        return count;
    }

    public String palavraMaisFrequente(){
        String palavraMaisFrequente = "";
        int count = 0;

        for(Map.Entry<String, Integer> entry : palavras.entrySet()){
            if(entry.getValue() > count){
                count = entry.getValue();
                palavraMaisFrequente = entry.getKey();
            }
        }

        return palavraMaisFrequente + " : " + count;
    }
}
