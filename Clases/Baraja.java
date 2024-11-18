import java.util.Collections;

class Baraja extends Mazo {
// Clase derivada: Baraja (mazo general)
    // Constructor
    public Baraja() {
        super();
    }

    // Método para barajar la baraja
    public void barajar() {
        Collections.shuffle(cartas); // Mezcla las cartas de manera aleatoria
    }

    // Devolver carta al fondo
    public void devolverCarta(Carta carta) {
        cartas.add(0, carta); // Agrega la carta al inicio de la lista, se usa cuando se queda sin cartas y se rellena de las cartas jugadas
    }

    // Mostrar cartas en la baraja (para debug)
    @Override
    public void mostrarMazo() {
        System.out.println("Baraja actual:");
        for (Carta carta : cartas) {
            System.out.println("  - " + carta.getColorActual() + " " + carta.getValorActual());
        }
    }
}