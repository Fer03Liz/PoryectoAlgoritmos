import java.util.List;
import java.util.Random;

public class mazo {

    private List<carta> cartas;

    public mazo(List<carta> cartas) {
        this.cartas = cartas;
    }

    public void barajear() {
        Random random = new Random();
        int tamaño = cartas.size();

        for (int i = tamaño - 1; i > 0; i--) {
            int indiceAleatorio = random.nextInt(i + 1);
            carta cartaTemporal = cartas.get(i);
            cartas.set(i, cartas.get(indiceAleatorio));
            cartas.set(indiceAleatorio, cartaTemporal);
        }
    }

    @SuppressWarnings("null")
    public List<mazo> repartir(int numeroJugadore) {
        List<mazo> mazos = null;
        int k = 0;
        for (int i = 0; i < numeroJugadore; i++) {
            mazo c = null;
            for (int j = 0; j < 7; j++) {
                carta carta = cartas.get(k);
                c.agregarCarta(carta);
                cartas.remove(k);
                k++;
            }
            mazos.add(c);
        }
        return mazos;
    }

    public void agregarCarta(carta carta) {
        cartas.add(carta);
    }

    public boolean eliminarCarta(carta carta) {
        boolean bandera = false;
        for (carta c : cartas) {
            if (c.equals(carta)) {
                cartas.remove(c);
                bandera = true;
            }
        }
        return bandera;

    }

    public List<carta> getCartas() {
        return cartas;
    }

    public void setCartas(List<carta> cartas) {
        this.cartas = cartas;
    }

}