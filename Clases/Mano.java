import java.util.List;

public class Mano extends Mazo {

    public Mano() {
        super();
    }

    // Método para mostrar las cartas en la mano
    @Override
    public void mostrarMazo() {
        System.out.println("Mano del jugador:");
        for (Carta carta : cartas) {
            System.out.println("  - " + carta.getColorActual() + " " + carta.getValorActual());
        }
    }

    // Método para jugar una carta específica
    public Carta jugarCarta(int indice) {
        if (indice >= 0 && indice < cartas.size()) {
            return cartas.remove(indice); // Elimina y devuelve la carta jugada
        } else {
            System.out.println("Índice inválido.");
            return null;
        }
    }

    // Nuevo método: obtener la lista de cartas
    public List<Carta> getCartas() {
        return cartas; // Devuelve la lista de cartas
    }
}
