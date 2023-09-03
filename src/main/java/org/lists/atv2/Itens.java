package org.lists.atv2;

public class Itens {

    private String descricao;
    private Double valor;
    private int quantidade;

    public Itens(String descricao, Double valor, int quantidade) {
        this.descricao = descricao;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public Double getValor() {
        return valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Double valorTotal(){
        return this.valor * this.quantidade;
    }

    @Override
    public String toString() {
        return "Itens{" +
                "descricao='" + descricao + '\'' +
                ", valor=" + valor +
                ", quantidade=" + quantidade +
                '}';
    }
}
