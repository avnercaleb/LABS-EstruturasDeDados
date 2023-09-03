package org.sets.atv1;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    Set<Convidado> convs = new HashSet<>();

    public void addConvidado(String nome, int convite){
        convs.add(new Convidado(nome, convite));
    }

    public void removeConvidado(int conv){
        Convidado c = null;

        if(!convs.isEmpty()){
            for(Convidado i : convs){
                if(i.getConvite() == conv){
                    c = i;
                    break;
                }
            }
            convs.remove(c);
        }
    }

    public int lotacao(){
        return convs.size();
    }

    public void listarConvidados(){
        System.out.println(convs);
    }
}
