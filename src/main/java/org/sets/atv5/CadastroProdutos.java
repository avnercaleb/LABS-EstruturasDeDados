package org.sets.atv5;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    Set<Produto> cadastro = new HashSet<>();

    public void cadastrarProduto(Long cod, String nome, Double preco, Integer quantidade){
        cadastro.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto> listarPorNome(){
        Set<Produto> listaPorNome = new TreeSet<>(cadastro);
        return listaPorNome;
    }

    public Set<Produto> listaPorPreco(){
        Set<Produto> listaPorNome = new TreeSet<>(new ListarProPreco());
        listaPorNome.addAll(cadastro);
        return listaPorNome;
    }
}
