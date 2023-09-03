package org.sets.atv4;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

    Set<Tarefa> lista = new HashSet<>();

    public void adicionarTarefa(String desc){
        lista.add(new Tarefa(desc));
    }

    public void removerTarefa(String desc){
        if(!lista.isEmpty()){
            for(Tarefa t : lista){
                if(t.getDesc().equalsIgnoreCase(desc))
                    lista.remove(t);
            }
        } else throw new RuntimeException("Tarefa nao encontrada");
    }

    public void exibirTarefas(){
        System.out.println(lista);
    }

    public String contarTarefas(){
        return "Vc tem: " + lista.size() + " tarefas";
    }

    public Set<Tarefa> tarefasConcluidas(){
        Set<Tarefa> concluidas = new HashSet<>();

        for(Tarefa t : lista){
            if(t.getFeito())
                concluidas.add(t);
        }

        return concluidas;
    }

    public Set<Tarefa> tarefasPendentes(){
        Set<Tarefa> pendentes = new HashSet<>();

        for(Tarefa t : lista){
            if(!t.getFeito())
                pendentes.add(t);
        }

        return pendentes;
    }

    public void concluirTarefa(String desc){
        for(Tarefa t : lista){
            if(t.getDesc().equalsIgnoreCase(desc))
                t.setFeito(true);
        }
    }

    public void limparLista(){
        lista.clear();
    }
}
