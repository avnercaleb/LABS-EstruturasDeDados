package org.map.atv3;

public class Teste {
    public static void main(String[] args) {

        Estoque estoque = new Estoque();

        estoque.adicionarProduto("10001", "Refrigerante", 5, 6.50D);
        estoque.adicionarProduto("10002", "Biscoito", 3, 2.50D);
        estoque.adicionarProduto("10003", "Cafe", 1, 7.50D);

        estoque.exibirEstoque();
        System.out.println(estoque.valorTotal());
        System.out.println(estoque.maisCaro());
        System.out.println(estoque.maisBarato());
    }
}
