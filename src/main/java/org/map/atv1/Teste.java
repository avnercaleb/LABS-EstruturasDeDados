package org.map.atv1;

public class Teste {
    public static void main(String[] args) {

        Agenda agenda = new Agenda();

        agenda.adicionarContato("Avner", "71984848812");
        agenda.adicionarContato("Camila", "71986624500");
        agenda.adicionarContato("Rafael", "71987249631");

        agenda.pesquisarContato("Avner");
        agenda.removerContato("Avner");
        agenda.exibirContatos();
    }
}
