package org.example.models;

import lombok.Getter;

@Getter
public enum TipoContratto {
    FULL_TIME(40, "Contratto 40 ore settimanali"),
    PART_TIME_30(30, "Contratto 30 ore settimanali"),
    PART_TIME_20(20, "Contratto 20 ore settimanali"),
    APPRENDISTATO(32, "Contratto apprendistato 32 ore");

    private final int oreSettimanali;
    private final String descrizione;

    TipoContratto(int oreSettimanali, String descrizione) {
        this.oreSettimanali = oreSettimanali;
        this.descrizione = descrizione;
    }
}