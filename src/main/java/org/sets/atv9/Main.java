package org.sets.atv9;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        List<String> nomes = List.of("Avner", "Caleb", "Camila", "Sophia", "Isadora", "Caleb", "Camila", "Sophia");
        Set<String> res = new HashSet<>(nomes);

        System.out.println(res);
    }
}
