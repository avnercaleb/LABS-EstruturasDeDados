package org.sets.atv1;

public class Teste {
    public static void main(String[] args) {

        ConjuntoConvidados c = new ConjuntoConvidados();

        c.addConvidado("Pedro", 10);
        c.addConvidado("Caleb", 15);
        c.addConvidado("Paulo", 111);

        c.removeConvidado(111);
        c.removeConvidado(15);
        c.listarConvidados();
    }
}
