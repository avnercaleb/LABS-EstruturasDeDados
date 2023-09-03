package org.map.atv5;

import java.time.LocalDate;
import java.time.Month;

public class Teste {
    public static void main(String[] args) {

        Agenda agenda = new Agenda();

        agenda.adicionar(LocalDate.of(2023, Month.AUGUST, 25), "festival de Verão", "barão vermelho");
        agenda.adicionar(LocalDate.of(2023, Month.DECEMBER, 25), "festival de inverno", "SKANK");
        agenda.adicionar(LocalDate.of(2023, Month.SEPTEMBER, 10), "festival de samba", "exaltasamba");

        agenda.proximoEvento();
    }
}
