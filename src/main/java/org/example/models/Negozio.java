package org.example.models;

import lombok.*;
import java.time.YearMonth;
import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Negozio {
    private Integer id; // Gestito dal Database (null prima del salvataggio)
    private String nome;
    private String sigla;

    // Mappa che collega ogni mese (es. "2026-06") alla sua pianificazione specifica
    @Builder.Default
    private Map<YearMonth, PianificazioneMensile> storicoPianificazioni = new HashMap<>();
}