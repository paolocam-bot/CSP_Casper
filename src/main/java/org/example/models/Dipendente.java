package org.example.models;

import lombok.*;
import java.time.LocalDate;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Dipendente {

    private String id;
    private String nome;
    private String cognome;
    private String codiceFiscale;
    // Usa LocalDate (Java 8+) invece di Date (che è obsoleto)
    private LocalDate dataNascita;
    private String negozioAssunto;

    // Sostituiamo 'strike' con un nome più chiaro e più versatile
    // Se vuoi davvero solo un booleano:
    private boolean isTopPerformer;

    // CONSIGLIO: Se volessi in futuro graduare la performance:
    // private int livelloVendita; // es da 1 a 10
}