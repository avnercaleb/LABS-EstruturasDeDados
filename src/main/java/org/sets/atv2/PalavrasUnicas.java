package org.sets.atv2;

import java.util.HashSet;
import java.util.Set;

public class PalavrasUnicas {

    Set<String> palavras = new HashSet<>();

    public void addPalavra(String s){
        palavras.add(s);
    }

    public void removerPalavra(String s){
        String i = "";

        if(!palavras.isEmpty()){
            for(String n : palavras){
                if(n.equals(s)){
                    i = n;
                    break;
                }
            }
        }
        palavras.remove(i);
    }

    public void imprimirPalavras(){
        System.out.println(palavras);
    }

    public String pesquisaPalavra(String s){
        String filtro = "";

        if(!palavras.isEmpty()){
            for(String i : palavras){
                if(i.equalsIgnoreCase(s)){
                    filtro = i;
                }
            }
            return filtro;
        } else {
            return "a palavra nao esta no conjunto";
        }

    }
}
