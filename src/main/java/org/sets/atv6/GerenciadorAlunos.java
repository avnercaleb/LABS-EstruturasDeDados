package org.sets.atv6;

import java.util.HashSet;
import java.util.Set;

public class GerenciadorAlunos {

    Set<Aluno> alunos = new HashSet<>();

    public void adicionarAluno(String nome, Long mat, Double media){
        alunos.add(new Aluno(nome, mat, media));
    }
}
