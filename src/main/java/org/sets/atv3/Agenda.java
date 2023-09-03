package org.sets.atv3;

import java.util.HashSet;
import java.util.Set;

public class Agenda {

    Set<Contato> agenda = new HashSet<>();

    public void adicionaContato(String nome, String numero){
        agenda.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        if(!agenda.isEmpty())
            System.out.println(agenda);
        else
            throw new RuntimeException("A agenda esta vazia");
    }

    public Set<Contato> buscaContatos(String nome){
        Set<Contato> filtro = new HashSet<>();

        if(!agenda.isEmpty()){
            for(Contato c : agenda){
                if(c.getNome().startsWith(nome)){
                    filtro.add(c);
                }
            }
        } else {
            throw new RuntimeException("A agenda esta vazia");
        }
        return filtro;
    }

    public void atualizaNumero(String nome, String numero, String novoNumero){
        for(Contato c : agenda){
            if(c.getNumero().equals(numero)){
                c.setNumero(novoNumero);
            }
        }
    }
}
