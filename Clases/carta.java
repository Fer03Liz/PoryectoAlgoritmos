public class carta {
    private String color1;
    private String color2;
    private Integer valor1;
    private Integer valor2;
    private String accion1;
    private String accion2;
    private int lado1; // 0 para tradicional, 1 para lado oscuro (FLIP)
    private int lado2; // 0 para tradicional, 1 para lado oscuro (FLIP)

    public carta(String color1, String color2, Integer valor1, Integer valor2, String accion1, String accion2,
            int lado1, int lado2) {
        this.accion1 = accion1;
        this.color1 = color1;
        this.valor1 = valor1;
        this.lado1 = lado1;
        this.accion2 = accion2;
        this.color2 = color2;
        this.valor2 = valor2;
        this.lado2 = lado2;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado) {
        this.lado2 = lado;
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado) {
        this.lado1 = lado;
    }

    public String getAccion1() {
        return accion1;
    }

    public void setAccion1(String accion) {
        this.accion1 = accion;
    }

    public String getAccion2() {
        return accion2;
    }

    public void setAccion2(String accion) {
        this.accion2 = accion;
    }

    public Integer getValor1() {
        return valor1;
    }

    public void setValor1(Integer valor) {
        this.valor1 = valor;
    }

    public Integer getValor2() {
        return valor2;
    }

    public void setValor2(Integer valor) {
        this.valor2 = valor;
    }

    public String getColor1() {
        return color1;
    }

    public void setColor1(String color) {
        this.color1 = color;
    }

    public String getColor2() {
        return color2;
    }

    public void setColor2(String color) {
        this.color2 = color;
    }

}