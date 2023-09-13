package org.map.atv7;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ContadorPalavras cp = new ContadorPalavras();
        String texto = "Uma frase com 2 numeros 2 e 3 numeros 3";

        for(Map.Entry<String, Integer> entrada : cp.contarPalavras(texto).entrySet()){
            System.out.println(entrada.getKey() + "=" + entrada.getValue());
        }
    }
}
