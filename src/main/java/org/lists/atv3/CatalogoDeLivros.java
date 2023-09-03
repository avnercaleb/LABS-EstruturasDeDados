package org.lists.atv3;

import java.util.ArrayList;
import java.util.List;

public class CatalogoDeLivros {

    List<Livro> catalogo = new ArrayList<>();

    public void adicionaLivro(String titulo, String autor, int ano){
        catalogo.add(new Livro(titulo, autor, ano));
    }

    public List<Livro> listaPorAutor(String autor){
        List<Livro> filtro = new ArrayList<>();

        for(Livro l : catalogo){
            if(l.getAutor().equalsIgnoreCase(autor)){
                filtro.add(l);
            }
        }

        return filtro;
    }

    public List<Livro> listaPorIntervalo(int inicio, int fim){
        List<Livro> filtro = new ArrayList<>();

        for(Livro l : catalogo){
            if(l.getLancamento() >= inicio && l.getLancamento() <= fim){
                filtro.add(l);
            }
        }

        return filtro;
    }

    public Livro buscaPorTitulo(String titulo){
        for(Livro l : catalogo){
            if(l.getTitulo().equalsIgnoreCase(titulo)){
                return new Livro(l.getTitulo(), l.getAutor(), l.getLancamento());
            }
        }
        return null;
    }
}
