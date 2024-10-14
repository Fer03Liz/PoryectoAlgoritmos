public class juego {

    private int numeroJugadores;

    private mazo cartasCaja;

    public int getNumeroJugadores() {
        return numeroJugadores;
    }

    public void setNumeroJugadores(int numeroJugadores) {
        this.numeroJugadores = numeroJugadores;
    }

    public juego() {

    }

    public static void main(String[] args) {
        System.err.println("HOLA MUNDO  ");

    }

    public mazo getCartasCaja() {
        return cartasCaja;
    }

    public void setCartasCaja(mazo cartasCaja) {
        this.cartasCaja = cartasCaja;
    }
}