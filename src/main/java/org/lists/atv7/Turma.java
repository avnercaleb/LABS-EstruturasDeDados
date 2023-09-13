package org.lists.atv7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Turma {

    List<Aluno> turma = new ArrayList<>();

    public void adicionarAluno(Aluno aluno){
        this.turma.add(aluno);
    }

    public void removerAluno(Aluno aluno){
        this.turma.remove(aluno);
    }

    public void imprimirTurma(){
        Iterator<Aluno> alunos = this.turma.iterator();
        while (alunos.hasNext()){
            Aluno aluno = alunos.next();
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
