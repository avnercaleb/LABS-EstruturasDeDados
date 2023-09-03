package org.lists.atv1;

import org.lists.atv1.Tarefa;

import java.util.ArrayList;
import java.util.List;

public class ListaDeTarefas {
    List<Tarefa> tarefas = new ArrayList<>();

    public void adicionarTarefa(String desc) {
        this.tarefas.add(new Tarefa(desc));
    }

    public void removeTarefa(String desc){
        List<Tarefa> tarefasRemovidas = new ArrayList<>();

        for(Tarefa t : tarefas){
            if(t.getDescricao().equalsIgnoreCase(desc))
                tarefasRemovidas.add(t);
        }

        tarefas.removeAll(tarefasRemovidas);
    }

    public Integer numeroDeTarefas(){
        return tarefas.size();
    }

    public void listarTarefas(){
        System.out.println(tarefas);
    }


}
