package org.map.atv2;

public class Teste {
    public static void main(String[] args) {

        Dicionario dic = new Dicionario();

        dic.adicionarPalavra("Pão", "Alimento a base de farinha");
        dic.adicionarPalavra("Anão", "Pessoa pequena");
        dic.adicionarPalavra("Avião", "Transporte aereo");

        dic.remorPalavra("Avião");
        dic.listarPalavras();
        dic.buscarPalavra("Avião");
    }
}
