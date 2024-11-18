public class Carta {

    // Clase interna para definir los atributos de cada lado de la carta
    private static class Lado {
        private String color;
        private Integer valor;
        private String accion;

        public Lado(String color, Integer valor, String accion) {
            this.color = color;
            this.valor = valor;
            this.accion = accion;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public Integer getValor() {
            return valor;
        }

        public void setValor(Integer valor) {
            this.valor = valor;
        }

        public String getAccion() {
            return accion;
        }

        public void setAccion(String accion) {
            this.accion = accion;
        }
    }

    private Lado ladoClaro; // Atributos para el lado claro
    private Lado ladoOscuro; // Atributos para el lado oscuro
    private boolean esLadoClaroActivo; // Indica si el lado claro está activo

    // Constructor
    public Carta(String colorClaro, Integer valorClaro, String accionClaro,
                 String colorOscuro, Integer valorOscuro, String accionOscuro) {
        this.ladoClaro = new Lado(colorClaro, valorClaro, accionClaro);
        this.ladoOscuro = new Lado(colorOscuro, valorOscuro, accionOscuro);
        this.esLadoClaroActivo = true; // Empieza en el lado claro
    }

    // Método para alternar entre lados
    public void flip() {
        esLadoClaroActivo = !esLadoClaroActivo;
    }

    // Métodos para obtener los atributos del lado activo
    public String getColorActual() {
        if (esLadoClaroActivo) {
            return ladoClaro.getColor(); // Lado claro activo
        } else {
            return ladoOscuro.getColor(); // Lado oscuro activo
        }
    }

    public Integer getValorActual() {
        if (esLadoClaroActivo) {
            return ladoClaro.getValor(); // Lado claro activo
        } else {
            return ladoOscuro.getValor(); // Lado oscuro activo
        }
    }

    public String getAccionActual() {
        if (esLadoClaroActivo) {
            return ladoClaro.getAccion(); // Lado claro activo
        } else {
            return ladoOscuro.getAccion(); // Lado oscuro activo
        }
    }

    // Métodos adicionales para cambiar atributos de cada lado (si es necesario)
    public void setLadoClaro(String color, Integer valor, String accion) {
        ladoClaro.setColor(color);
        ladoClaro.setValor(valor);
        ladoClaro.setAccion(accion);
    }

    public void setLadoOscuro(String color, Integer valor, String accion) {
        ladoOscuro.setColor(color);
        ladoOscuro.setValor(valor);
        ladoOscuro.setAccion(accion);
    }
}
