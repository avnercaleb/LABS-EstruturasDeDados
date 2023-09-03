package org.sets.atv3;

public class Teste {
    public static void main(String[] args) {

        Agenda a = new Agenda();

        a.adicionaContato("Avner", "71984848812");
        a.adicionaContato("Camila", "71986624500");
        a.adicionaContato("Caleb", "71981023266");
        a.adicionaContato("Rafael", "71987249631");

        a.atualizaNumero("Avner", "71984848812", "999999999");
        a.exibirContatos();
    }
}
