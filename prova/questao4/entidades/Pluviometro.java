package questao4.entidades;

public class Pluviometro {
    protected String tipo;
    protected double peso;
    

    public Pluviometro(String tipo) {
        this.tipo = tipo;
    }

    public Pluviometro() {
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    
    
}
