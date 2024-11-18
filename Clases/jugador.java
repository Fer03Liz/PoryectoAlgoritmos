public abstract class Jugador {

    private String nombre;
    private Mano cartas; // Mano del jugador

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.cartas = new Mano();
    }

    // Método para jugar una carta (remover de la mano)
    public boolean jugarCarta(Carta carta) {
        return cartas.getCartas().remove(carta); // Ahora accede correctamente a las cartas
    }

    // Método para jugar una carta por índice
    public Carta jugarCartaPorIndice(int indice) {
        return cartas.jugarCarta(indice); // Usa el método de la clase Mano
    }

    // Método abstracto: realizar el turno
    public abstract void realizarTurno();

    // Getters y setters
    public Mano getCartas() {
        return cartas;
    }

    public void setCartas(Mano cartas) {
        this.cartas = cartas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
