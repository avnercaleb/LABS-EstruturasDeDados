package org.lists.atv6;

public class Teste {
    public static void main(String[] args) {

        OrdenaNumeros lista = new OrdenaNumeros();

        lista.addNums(10);
        lista.addNums(20);
        lista.addNums(30);
        lista.addNums(40);
        lista.addNums(50);

        System.out.println(lista.listaCrescente());
        System.out.println(lista.listaDecrescente());
    }
}
