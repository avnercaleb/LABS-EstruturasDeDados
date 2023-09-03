package org.lists.atv4;

public class Teste {
    public static void main(String[] args) {

        SomaNumeros numeros = new SomaNumeros();

        numeros.adicionaNumero(10);
        numeros.adicionaNumero(1);
        numeros.adicionaNumero(23);
        numeros.adicionaNumero(55);

        System.out.println(numeros.somaNumeros());
    }
}
