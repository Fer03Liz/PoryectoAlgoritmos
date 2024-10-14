
public class jugador {

    private String nombre;

    private int puntuacion;

    private mazo cartas;

    public boolean jugarCarta(carta carta){
        boolean bandera = false;
        for (carta  c : cartas.getCartas()) {
            if(c.equals(carta)){
                bandera= true;
                cartas
            }
        }
        return bandera;

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