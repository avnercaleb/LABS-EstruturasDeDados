package org.lists.atv8;

public class Main {
    public static void main(String[] args) {

        //Iterando uma List com Objeto ListIterator

        Turma turma = new Turma();

        turma.adicionarAluno(new Aluno("Avner", 35));
        turma.adicionarAluno(new Aluno("Camila", 33));
        turma.adicionarAluno(new Aluno("Sophia", 12));
        turma.adicionarAluno(new Aluno("Isadora", 5));
        turma.adicionarAluno(new Aluno("Caleb", 35));

        turma.imprimirTurma();
    }
}
