package org.map.atv6;

public class Teste {
    public static void main(String[] args) {

        Livraria liv = new Livraria();

        liv.adicionarLivro("www.url.com", "Java", "Avner Caleb", 100D);
        liv.adicionarLivro("www.uri.com", "JavaScript", "Rodrigo Souza", 200D);

        liv.removerLivro("Java");
        liv.exibirLivros();
    }
}
