import org.example.models.Turno;

void main() {
    Turno t = Turno.builder()
            .idDipendente("D1")
            .slotInizio(20)
            .slotFine(30)
            .build();

    try {
        t.validate(); // Qui il programma si ferma se i dati sono sbagliati
        // Se passa, procedi con l'assegnazione...
    } catch (IllegalArgumentException e) {
        System.err.println("Turno non valido: " + e.getMessage());
    }
}