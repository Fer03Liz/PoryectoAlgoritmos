import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Juego {

    private Baraja baraja;
    private List<Jugador> jugadores;
    private static final int CARTAS_INICIALES = 7; // Número de cartas iniciales por jugador

    public Juego() {
        this.baraja = new Baraja();
        this.jugadores = new ArrayList<>();
    }

    // Método para iniciar el juego
    public void iniciar() {
        Scanner scanner = new Scanner(System.in);

        // Crear la baraja completa
        System.out.println("Creando la baraja...");
        crearBaraja();

        // Preguntar el número de jugadores
        int numeroJugadores = 0;
        while (numeroJugadores < 2 || numeroJugadores > 10) {
            System.out.print("Ingrese el número de jugadores (2-10): ");
            numeroJugadores = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea
        }

        // Preguntar cuántos jugadores serán humanos
        int numeroHumanos = -1;
        while (numeroHumanos < 0 || numeroHumanos > numeroJugadores) {
            System.out.print("¿Cuántos jugadores serán humanos? ");
            numeroHumanos = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea
        }

        // Crear jugadores humanos
        for (int i = 1; i <= numeroHumanos; i++) {
            System.out.print("Ingrese el nombre del jugador humano " + i + ": ");
            String nombre = scanner.nextLine();
            jugadores.add(new JugadorHumano(nombre));
        }

        // Crear jugadores sintéticos
        for (int i = 1; i <= (numeroJugadores - numeroHumanos); i++) {
            jugadores.add(new JugadorSintetico("Bot-" + i));
        }

        // Barajar la baraja
        baraja.barajar();

        // Repartir cartas iniciales
        repartirCartasIniciales();

        // Mostrar jugadores y sus manos
        System.out.println("\nJugadores y sus manos iniciales:");
        for (Jugador jugador : jugadores) {
            System.out.println("Jugador: " + jugador.getNombre());
            jugador.getCartas().mostrarMazo();
        }

        System.out.println("\n¡El juego está listo para comenzar!");
        // Aquí puedes agregar el bucle principal del juego
    }

    // Método para crear la baraja completa de UNO Flip
    private void crearBaraja() {
        String[] coloresLadoClaro = {"Rojo", "Azul", "Verde", "Amarillo"};
        String[] coloresLadoOscuro = {"Rosa", "Turquesa", "Morado", "Naranja"};
        String[] accionesLadoClaro = {"Saltar", "Reversa", "+2"};
        String[] accionesLadoOscuro = {"Saltar", "Reversa", "+5"};
    
        // Generar cartas numéricas (0-9)
        for (int i = 0; i < coloresLadoClaro.length; i++) {
            for (int valor = 0; valor <= 9; valor++) {
                baraja.agregarCarta(new Carta(coloresLadoClaro[i], valor, null, coloresLadoOscuro[i], valor, null));
            }
        }
    
        // Generar cartas de acción estándar (Saltar, Reversa, +2)
        for (int i = 0; i < coloresLadoClaro.length; i++) {
            for (String accion : accionesLadoClaro) {
                baraja.agregarCarta(new Carta(coloresLadoClaro[i], -1, accion, coloresLadoOscuro[i], -1, null));
            }
        }
    
        // Generar cartas de acción avanzadas para el lado oscuro (+5)
        for (int i = 0; i < coloresLadoClaro.length; i++) {
            for (String accion : accionesLadoOscuro) {
                baraja.agregarCarta(new Carta(coloresLadoClaro[i], -1, null, coloresLadoOscuro[i], -1, accion));
            }
        }
    
        // Generar cartas "Flip" de color Comodín
        for (int i = 0; i < 4; i++) {
            baraja.agregarCarta(new Carta("Comodín", -1, "Flip", "Comodín", -1, "Flip"));
        }
    
        // Generar cartas de comodín y Wild +4
        for (int i = 0; i < 4; i++) {
            baraja.agregarCarta(new Carta("Comodín", -1, "Wild", "Comodín", -1, "Wild"));
            baraja.agregarCarta(new Carta("Comodín", -1, "Wild +4", "Comodín", -1, "Wild +4"));
        }
    }
    

    // Método para repartir cartas iniciales a cada jugador
    private void repartirCartasIniciales() {
        for (int i = 0; i < CARTAS_INICIALES; i++) {
            for (Jugador jugador : jugadores) {
                Carta carta = baraja.tomarCarta();
                if (carta != null) {
                    jugador.getCartas().agregarCarta(carta);
                }
            }
        }
    }

    // Método principal
    public static void main(String[] args) {
        Juego juego = new Juego();
        juego.iniciar();
    }
}
