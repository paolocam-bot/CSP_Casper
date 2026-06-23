package org.example.models;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Turno {
    private String idDipendente;
    private String idNegozio;
    private int giornoDellaSettimana;
    private int slotInizio;
    private int slotFine;

    /** Metodo di validazione manuale che chiamerai prima di elaborare il turno
     * per verificare che la data di inizio non sia superiore alla data di fine
     *
     */
    public void validate() {
        if (slotInizio < 0 || slotFine > 47) {
            throw new IllegalArgumentException("Slot fuori intervallo (0-47).");
        }
        if (slotInizio > slotFine) {
            throw new IllegalArgumentException("Lo slot di inizio deve essere <= slot di fine.");
        }
    }

    public int getDurataInSlot() {
        return (slotFine - slotInizio) + 1;
    }
}