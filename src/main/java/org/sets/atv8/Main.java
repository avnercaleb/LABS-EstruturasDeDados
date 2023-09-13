package org.sets.atv8;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<String> s1 = Set.of("Avner", "Caleb", "Sophia");
        Set<String> s2 = Set.of("Avner", "Caleb", "Isadora", "Camila");
        Set<String> res = new HashSet<>();

        res = inter(s1, s2);

        System.out.println(res);
    }

    public static Set<String> inter(Set<String> s1, Set<String> s2){
        Set<String> res = new HashSet<>();
        res.addAll(s1);
        res.addAll(s2);

        return res;
    }
}
