package org.lists.atv6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenaNumeros{

    private List<Integer> nums = new ArrayList<>();

    public void addNums(Integer num){
        nums.add(num);
    }

    public List<Integer> listaCrescente(){
        List<Integer> listaOrdenada = new ArrayList<>(nums);

        if(!nums.isEmpty())
            Collections.sort(listaOrdenada);
        else
            throw new RuntimeException("a lista esta vazia");

        return listaOrdenada;
    }

    public List<Integer> listaDecrescente(){
        List<Integer> listaOrdenada = new ArrayList<>(nums);

        if(!nums.isEmpty())
            Collections.reverse(listaOrdenada);
        else
            throw new RuntimeException("a lista esta vazia");

        return listaOrdenada;
    }
}
