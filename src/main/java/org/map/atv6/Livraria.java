package org.map.atv6;

import java.util.HashMap;
import java.util.Map;

public class Livraria {

    private Map<String, Livro> livraria = new HashMap<>();

    public void adicionarLivro(String link, String titulo, String autor, Double preco){
        livraria.put(link, new Livro(titulo, autor, preco));
    }

    public void removerLivro(String titulo){
        Livro livroRemovido = null;
        for(Map.Entry<String, Livro> entry : livraria.entrySet()){
            if(entry.getValue().getTitulo().equals(titulo)){
                livroRemovido = entry.getValue();
                break;
            }
        }
        livraria.remove(livroRemovido);
    }

    public void exibirLivros(){
        System.out.println(livraria);
    }
}
