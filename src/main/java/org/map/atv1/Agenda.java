package org.map.atv1;

import java.util.HashMap;
import java.util.Map;

public class Agenda {

    private Map<String, String> agenda = new HashMap<>();

    public void adicionarContato(String nome, String numero){
        agenda.put(nome, numero);
    }

    public void removerContato(String nome){
        agenda.remove(nome);
    }

    public void exibirContatos(){
        System.out.println(agenda);
    }

    public void pesquisarContato(String nome){
        System.out.println(agenda.get(nome));
    }
}
