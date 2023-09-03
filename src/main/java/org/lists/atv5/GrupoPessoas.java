package org.lists.atv5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GrupoPessoas {

    List<Pessoa> grupo = new ArrayList<>();

    public void adicionaPessoa(String nome, int idade, Double altura){
        grupo.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenaPorIdade(){
        List<Pessoa> listaPorIdade = new ArrayList<>(grupo);
        Collections.sort(listaPorIdade);
        return listaPorIdade;
    }

    public List<Pessoa> ordenaPorAltura(){
        List<Pessoa> ordenaPorAltura = new ArrayList<>(grupo);
        Collections.sort(ordenaPorAltura, new OrdenaPorAltura());
        return ordenaPorAltura;
    }
}
