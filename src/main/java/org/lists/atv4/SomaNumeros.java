package org.lists.atv4;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    private List<Integer> lista = new ArrayList<>();

    public void adicionaNumero(Integer num){
        lista.add(num);
    }

    public Integer somaNumeros(){
        Integer sum = 0;

        for(Integer l : lista){
            sum += l;
        }
        return sum;
    }

    public Integer maiorNumero(){
        Integer maiorNumero = Integer.MIN_VALUE;

        for(Integer l : lista){
            if(l > maiorNumero)
                maiorNumero = l;
        }

        return maiorNumero;
    }

    public Integer menorNumero(){
        Integer menorNumero = Integer.MAX_VALUE;

        for(Integer l : lista){
            if(l < menorNumero)
                menorNumero = l;
        }

        return menorNumero;
    }

    public void imprimeNumeros(){
        System.out.println(lista);
    }
}
