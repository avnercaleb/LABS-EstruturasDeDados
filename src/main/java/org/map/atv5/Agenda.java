package org.map.atv5;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Agenda {

    private Map<LocalDate, Evento> agenda = new HashMap<>();

    public void adicionar(LocalDate data, String evento, String atracao){
        agenda.put(data, new Evento(evento, atracao));
    }

    public void listarEventos(){
        Map<LocalDate, Evento> listagem = new TreeMap<>(agenda);
        System.out.println(listagem);
    }

    public void proximoEvento(){
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;

        Map<LocalDate, Evento> listagem = new TreeMap<>(agenda);

        for(Map.Entry<LocalDate, Evento> entry : listagem.entrySet()){
            if(entry.getKey().equals(dataAtual) || entry.getKey().isAfter(dataAtual)){
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                break;
            }
        }

        System.out.println("O proximo evento sera o " + proximoEvento + " na data " + proximaData);
    }
}
