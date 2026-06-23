package org.example.models;

import lombok.*;

import java.util.List;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Negozio {
    // Se il database genera l'ID, usiamo Integer (può essere null)
    private Integer id;
    private String nome;
    private String sigla;
    private List<Dipendente> dipendeti;

    // Inizializziamo subito la matrice
    private boolean[][] orariApertura = new boolean[7][48];
}