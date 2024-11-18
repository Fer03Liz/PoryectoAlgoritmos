import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JugadorSintetico extends Jugador {

    public JugadorSintetico(String nombre) {
        super(nombre);
    }

    @Override
    public void realizarTurno(Carta cartaEnJuego, Baraja mazoPrincipal, Baraja mazoDescarte) {
        System.out.println(getNombre() + " está jugando su turno...");

        // Buscar cartas jugables
        List<Carta> cartasJugables = new ArrayList<>();
        for (Carta carta : getCartas().getCartas()) {
            if (esCartaJugable(carta, cartaEnJuego)) {
                cartasJugables.add(carta);
            }
        }

        // Decidir acción
        if (!cartasJugables.isEmpty()) {
            // Seleccionar una carta jugable al azar
            Random random = new Random();
            Carta cartaSeleccionada = cartasJugables.get(random.nextInt(cartasJugables.size()));

            // Jugar la carta
            getCartas().jugarCarta(getCartas().getCartas().indexOf(cartaSeleccionada));
            mazoDescarte.agregarCarta(cartaSeleccionada);
            System.out.println(getNombre() + " jugó: " + cartaSeleccionada.getColorActual() + " " + cartaSeleccionada.getValorActual());
        } else {
            // Robar una carta
            Carta cartaRobada = mazoPrincipal.tomarCarta();
            if (cartaRobada != null) {
                getCartas().agregarCarta(cartaRobada);
                System.out.println(getNombre() + " no tenía cartas jugables y robó: " + cartaRobada.getColorActual() + " " + cartaRobada.getValorActual());
            } else {
                System.out.println(getNombre() + " intentó robar una carta, pero el mazo principal está vacío.");
            }
        }
    }

    // Método para verificar si una carta es jugable
    private boolean esCartaJugable(Carta carta, Carta cartaEnJuego) {
        return carta.getColorActual().equals(cartaEnJuego.getColorActual()) ||
               carta.getValorActual().equals(cartaEnJuego.getValorActual()) ||
               (carta.getAccionActual() != null && carta.getAccionActual().equals(cartaEnJuego.getAccionActual()));
    }
}
