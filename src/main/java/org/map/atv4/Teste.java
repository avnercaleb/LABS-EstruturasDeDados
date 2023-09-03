package org.map.atv4;

public class Teste {
    public static void main(String[] args) {

        ContadorPalavras count = new ContadorPalavras();

        count.addPalavra("Avner", 10);
        count.addPalavra("Caleb", 1);
        count.addPalavra("Camila", 5);
        count.addPalavra("Sophia", 20);

        System.out.println(count.contagemTotal());
    }
}
