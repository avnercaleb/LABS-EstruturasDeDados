package org.sets.atv7;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Set<Integer> conjunto = new HashSet();

        for(int i = 0; i < 10; i ++ ){
            conjunto.add((int) (Math.random() * 100));
        }

        System.out.println("Lista aleatoria:");
        for(Integer i : conjunto)
            System.out.print(i + " ");

        Set<Integer> res = conjunto.stream()
                .filter(x -> x % 2 != 0)
                .collect(Collectors.toSet());

        System.out.println("\nLista retirando os numeros pares:");
        for(Integer i : res)
            System.out.print(i + " ");
    }
}
