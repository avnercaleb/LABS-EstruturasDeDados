package org.lists.atv3;

public class Teste {
    public static void main(String[] args) {

        CatalogoDeLivros catalogo = new CatalogoDeLivros();

        catalogo.adicionaLivro("Java Definitivo", "Avner Caleb", 2024);
        catalogo.adicionaLivro("JS Definitivo", "Camila Santos", 2020);
        catalogo.adicionaLivro("Docker Definitivo", "Sophia Helena", 2019);
        catalogo.adicionaLivro("Python Definitivo", "Isadora Lima", 1999);
        catalogo.adicionaLivro("Angular Definitivo", "avner caleb", 2017);

        System.out.println(catalogo.buscaPorTitulo("Python Definitivo"));
    }
}
