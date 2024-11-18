import java.util.ArrayList;
import java.util.List;

public abstract class Mazo {
    
    protected List<Carta> cartas; // Lista de cartas

    // Constructor
    public Mazo() {
        this.cartas = new ArrayList<>();
    }

    // Métodos comunes
    public void agregarCarta(Carta carta) {
        cartas.add(carta);
    }

    public Carta tomarCarta() {
        if (!cartas.isEmpty()) {
            return cartas.remove(cartas.size() - 1); // Siempre toma del final
        } else {
            return null; // Si el mazo está vacío
        }
    }

    public int contarCartas() {
        return cartas.size();
    }

    public boolean estaVacio() {
        return cartas.isEmpty();
    }

    // Método abstracto para las clases derivadas
    public abstract void mostrarMazo();
}