package org.lists.atv7;

public class Main {
    public static void main(String[] args) {

        //Iterando uma List com Objeto Iterator

        Turma turma = new Turma();

        turma.adicionarAluno(new Aluno("Avner", 35));
        turma.adicionarAluno(new Aluno("Camila", 33));
        turma.adicionarAluno(new Aluno("Sophia", 12));
        turma.adicionarAluno(new Aluno("Isadora", 5));
        turma.adicionarAluno(new Aluno("Caleb", 35));

        turma.imprimirTurma();
    }
}
