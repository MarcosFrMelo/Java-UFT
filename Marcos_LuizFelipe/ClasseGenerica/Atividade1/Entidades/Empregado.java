package ClasseGenerica.Atividade1.Entidades;

public class Empregado {
    private String nome;
    private double salario;

    public Empregado() {
    }

    public Empregado(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calcularImposto(){
        return salario * 0.05;
    }
}
