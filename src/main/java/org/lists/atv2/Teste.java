package org.lists.atv2;

public class Teste {
    public static void main(String[] args) {

        CarroDeCompra carro = new CarroDeCompra();

        carro.adicionaItem("item 1", 10.50, 3);
        carro.adicionaItem("item 2", 9.99, 5);
        carro.adicionaItem("item 3", 5D, 10);

        carro.removeItem("item 2");
        carro.imprimeLista();

        System.out.println(carro.valorCompra());
    }
}
