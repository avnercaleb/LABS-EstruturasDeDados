package org.lists.atv8;

import java.util.*;

public class Turma {

    List<Aluno> turma = new ArrayList<>();

    public void adicionarAluno(Aluno aluno){
        this.turma.add(aluno);
    }

    public void removerAluno(Aluno aluno){
        this.turma.remove(aluno);
    }

    public void imprimirTurma(){
        ListIterator<Aluno> alunos = turma.listIterator(turma.size());
        while (alunos.hasPrevious()){
            Aluno aluno = alunos.previous();
            System.out.println(aluno.getNome());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Turma turma1)) return false;
        return Objects.equals(turma, turma1.turma);
    }

    @Override
    public int hashCode() {
        return Objects.hash(turma);
    }
}
