package org.sets.atv4;

public class Teste {
    public static void main(String[] args) {

        ListaTarefas lista = new ListaTarefas();

        lista.adicionarTarefa("atv1");
        lista.adicionarTarefa("atv2");
        lista.adicionarTarefa("atv3");
        lista.adicionarTarefa("atv4");

        lista.concluirTarefa("atv1");
        lista.limparLista();
        lista.exibirTarefas();
    }
}
