package org.lists.atv5;

public class Teste {
    public static void main(String[] args) {

        GrupoPessoas grupo = new GrupoPessoas();

        grupo.adicionaPessoa("Avner", 35, 1.89D);
        grupo.adicionaPessoa("Camila", 33, 1.65D);
        grupo.adicionaPessoa("Isadora", 5, 1.29D);
        grupo.adicionaPessoa("Sophia", 12, 1.72D);

        System.out.println(grupo.ordenaPorIdade());
    }
}
