package org.example.models;

import lombok.Getter;
import lombok.Setter;
import java.time.YearMonth;
import java.util.Map;
import java.util.TreeMap;

@Getter
@Setter
public class PianificazioneMensile {
    private YearMonth meseDiRiferimento;
    // Usiamo TreeMap per avere i giorni ordinati automaticamente dal 1 al 28/30/31
    private Map<Integer, GiornoLavorativo> giorni = new TreeMap<>();

    public PianificazioneMensile(YearMonth meseDiRiferimento) {
        this.meseDiRiferimento = meseDiRiferimento;

        // Popola automaticamente il mese con il numero corretto di giorni
        for (int i = 1; i <= meseDiRiferimento.lengthOfMonth(); i++) {
            giorni.put(i, new GiornoLavorativo(meseDiRiferimento.atDay(i)));
        }
    }
}