
public class jugador {

    private String nombre;

    private int puntuacion;

    private mazo cartas;

    public jugador(String nombre) {
        this.nombre = nombre;
        puntuacion = 0;
        cartas = null;
    }

    public boolean jugarCarta(carta carta) {
        return cartas.eliminarCarta(carta);
    }

    public mazo getCartas() {
        return cartas;
    }

    public void setCartas(mazo cartas) {
        this.cartas = cartas;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}