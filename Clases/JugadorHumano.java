import java.util.Scanner;

public class JugadorHumano extends Jugador {

    public JugadorHumano(String nombre) {
        super(nombre);
    }

    @Override
    public void realizarTurno(Carta cartaEnJuego, Baraja mazoPrincipal, Baraja mazoDescarte) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(getNombre() + ", es tu turno.");
        System.out.println("Carta en juego: " + cartaEnJuego.getColorActual() + " " + cartaEnJuego.getValorActual());
        System.out.println("Tus cartas:");
        getCartas().mostrarMazo();

        System.out.println("Selecciona el índice de la carta que quieres jugar (o ingresa -1 para robar):");
        int indice = scanner.nextInt();

        if (indice == -1) {
            // Robar una carta
            Carta cartaRobada = mazoPrincipal.tomarCarta();
            if (cartaRobada != null) {
                getCartas().agregarCarta(cartaRobada);
                System.out.println("Robaste: " + cartaRobada.getColorActual() + " " + cartaRobada.getValorActual());
            } else {
                System.out.println("El mazo principal está vacío, no puedes robar.");
            }
        } else if (indice >= 0 && indice < getCartas().contarCartas()) {
            // Jugar la carta seleccionada
            Carta cartaSeleccionada = getCartas().jugarCarta(indice);
            mazoDescarte.agregarCarta(cartaSeleccionada);
            System.out.println(getNombre() + " jugó: " + cartaSeleccionada.getColorActual() + " " + cartaSeleccionada.getValorActual());
        } else {
            System.out.println("Índice inválido. Pierdes tu turno.");
        }
    }
}
