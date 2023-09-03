package org.lists.atv2;

import java.util.ArrayList;
import java.util.List;

public class CarroDeCompra {

    List<Itens> lista = new ArrayList<>();


    public void adicionaItem(String desc, Double valor, int quantidade){
        lista.add(new Itens(desc, valor, quantidade));
    }

    public void removeItem(String desc){
        List<Itens> itensRemovidos = new ArrayList<>();

        for(Itens i : lista){
            if(i.getDescricao().equalsIgnoreCase(desc))
                itensRemovidos.add(i);
        }

        lista.removeAll(itensRemovidos);
    }

    public Double valorCompra(){
        Double sum = 0D;

        for(Itens i : lista){
            sum += i.valorTotal();
        }

        return sum;
    }

    public void imprimeLista(){
        lista.forEach(System.out::println);
    }
}
