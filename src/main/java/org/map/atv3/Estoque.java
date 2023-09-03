package org.map.atv3;

import java.util.HashMap;
import java.util.Map;

public class Estoque {

    private Map<String, Produto> estoque = new HashMap<>();

    public void adicionarProduto(String cod, String desc, Integer quantidade, Double preco){
        estoque.put(cod, new Produto(desc, quantidade, preco));
    }

    public void exibirEstoque(){
        System.out.println(estoque);
    }

    public String valorTotal(){
        Double sum = 0D;

        for(Produto p : estoque.values()){
            sum += p.getValor() * p.getQuantidade();
        }

        return "Valor total do estoque e de: R$" + sum;
    }

    public Produto maisCaro(){
        Double maisCaro = Double.MIN_VALUE;
        Produto p = null;

        for(Produto n : estoque.values()){
            if(n.getValor() > maisCaro)
                maisCaro = n.getValor();
                p = n;
        }

        return p;
    }

    public Produto maisBarato(){
        Double maisBarato = Double.MAX_VALUE;
        Produto p = null;

        for(Produto n : estoque.values()){
            if(n.getValor() < maisBarato){
                maisBarato = n.getValor();
                p = n;
            }
        }

        return p;
    }
}
