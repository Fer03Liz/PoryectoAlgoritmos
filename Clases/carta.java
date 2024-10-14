public class carta {
    private String color;
    private Integer valor;
    private String accion;

    public carta(String color, Integer valor, String accion) {
        this.accion = accion;
        this.color = color;
        this.valor = valor;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}