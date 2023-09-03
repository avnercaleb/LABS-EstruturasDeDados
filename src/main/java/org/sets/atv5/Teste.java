package org.sets.atv5;

public class Teste {
    public static void main(String[] args) {

        CadastroProdutos cadastro = new CadastroProdutos();

        cadastro.cadastrarProduto(1000L, "P1", 10.50D, 10);
        cadastro.cadastrarProduto(1001L, "P2", 9.50D, 5);
        cadastro.cadastrarProduto(1002L, "P3", 1.50D, 15);
        cadastro.cadastrarProduto(1003L, "P4", 18.50D, 20);

        System.out.println(cadastro.listarPorNome());
        System.out.println(cadastro.listaPorPreco());
    }
}
