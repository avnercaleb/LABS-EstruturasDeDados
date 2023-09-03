package org.lists.atv1;

public class Teste {
    public static void main(String[] args) {

        ListaDeTarefas lista = new ListaDeTarefas();

        lista.adicionarTarefa("Tarefa 1");
        lista.adicionarTarefa("Tarefa 1");
        lista.adicionarTarefa("Tarefa 2");

        lista.removeTarefa("Tarefa 1");

        lista.listarTarefas();
    }
}
