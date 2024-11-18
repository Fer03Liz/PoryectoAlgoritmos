public class JugadorHumano extends Jugador {

    public JugadorHumano(String nombre) {
        super(nombre);
    }

    @Override
    public void realizarTurno() {
        System.out.println(getNombre() + ", es tu turno.");
        System.out.println("Tus cartas son:");
        getCartas().mostrarMazo();
        // Aquí agregarías lógica para capturar la carta que el usuario quiere jugar
        System.out.println("Decide qué carta jugar.");
    }
}
