package org.example.models;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class GiornoLavorativo {
    private LocalDate data;
    // Matrice 1D di 48 slot (es. slot 0 = 00:00-00:30, slot 47 = 23:30-24:00)
    private boolean[] orariApertura = new boolean[48];
    private List<Turno> turniAssegnati = new ArrayList<>();

    public GiornoLavorativo(LocalDate data) {
        this.data = data;
    }
}