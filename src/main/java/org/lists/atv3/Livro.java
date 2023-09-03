package org.lists.atv3;

public class Livro {

    private String titulo;
    private String autor;
    private int lancamento;

    public Livro(String titulo, String autor, int lancamento) {
        this.titulo = titulo;
        this.autor = autor;
        this.lancamento = lancamento;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getLancamento() {
        return lancamento;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", lancamento=" + lancamento +
                '}';
    }
}
