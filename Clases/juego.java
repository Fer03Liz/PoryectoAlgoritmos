import java.util.InputMismatchException;
import java.util.Scanner;

public class juego {

    private int numeroJugadores;

    private int numJugadoresReales;

    private int numJugadoresSinteticos;

    public int getNumJugadoresReales() {
        return numJugadoresReales;
    }

    public void setNumJugadoresReales(int numJugadoresReales) {
        this.numJugadoresReales = numJugadoresReales;
    }

    public int getNumJugadoresSinteticos() {
        return numJugadoresSinteticos;
    }

    public void setNumJugadoresSinteticos(int numJugadoresSinteticos) {
        this.numJugadoresSinteticos = numJugadoresSinteticos;
    }

    private mazo cartasCaja;

    public void iniciarJuego() {

    }

    public void terminarJuego() {

    }

    public juego() {

    }

    public static void main(String[] args) {
        System.out.println(
                "  *********************         ********************************************         *********************");
        System.out.println("                                *                                          * ");
        System.out.println("                                *   B   I   E   N   V   E   N   I   D   O  * ");
        System.out.println("                                *                                          * ");
        System.out.println("                                *                                          * ");
        System.out.println(
                "  *********************         ********************************************         *********************");

        juego juego = new juego();
        try (Scanner scanner = new Scanner(System.in)) {
            juego.setNumeroJugadores(0);
            int numJugadores;
            while (true) {
                try {
                    System.out.print("¿Cuántos jugadores van a participar? (entre 2 y 10): ");
                    numJugadores = scanner.nextInt();

                    if (numJugadores < 2 || numJugadores > 10) {
                        System.out.println("Error: el número de jugadores debe ser entre 2 y 10. Inténtalo de nuevo.");
                    } else {
                        break;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Error: debe introducir un número. Inténtalo de nuevo.");
                    scanner.next();
                }
            }
            juego.setNumeroJugadores(numJugadores);
            int numReales = 0;
            while (true) {
                try {
                    System.out.print(
                            "¿Cuántos jugadores serán reales? (entre 0 y " + juego.getNumeroJugadores() + "): ");
                    numReales = scanner.nextInt();

                    if (numReales < 0 || numReales > juego.getNumeroJugadores()) {
                        System.out.println("Error: el número de jugadores sintéticos debe ser entre 0 y "
                                + juego.getNumeroJugadores() + ". Inténtalo de nuevo.");
                    } else {
                        break;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Error: debe introducir un número. Inténtalo de nuevo.");
                    scanner.next();
                }
            }

            jugador[] jugadores = new jugador[numReales];

            for (int i = 0; i < numReales; i++) {
                System.out.print("Introduce el nombre del jugador " + (i + 1) + ": ");
                String nombre = scanner.next();

                jugadores[i] = new jugador(nombre);
                System.out.println("Jugador " + (i + 1) + " creado: " + jugadores[i].getNombre());
            }
            juego.setNumJugadoresReales(numReales);
            juego.setNumJugadoresSinteticos(numJugadores - numReales);
            System.out.println("¡Genial! El juego comenzará con " + numJugadores + " jugadores. ("
                    + juego.getNumJugadoresReales() + " son jugadores reales y " + juego.getNumJugadoresSinteticos()
                    + " son jugadores sinteticos)");
        }
    }

    public mazo getCartasCaja() {
        return cartasCaja;
    }

    public void setCartasCaja(mazo cartasCaja) {
        this.cartasCaja = cartasCaja;
    }

    public int getNumeroJugadores() {
        return numeroJugadores;
    }

    public void setNumeroJugadores(int numeroJugadores) {
        this.numeroJugadores = numeroJugadores;
    }
}