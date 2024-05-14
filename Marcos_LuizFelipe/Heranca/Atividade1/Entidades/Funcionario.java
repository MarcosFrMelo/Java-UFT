package Heranca.Atividade1.Entidades;

public class Funcionario {
    protected String nome;
    protected String RG;
    protected double vendas;
    
    public Funcionario() {
    }

    public Funcionario(String nome, String RG, double vendas) {
        this.nome = nome;
        this.RG = RG;
        this.vendas = vendas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String rG) {
        RG = rG;
    }

    public double getVendas() {
        return vendas;
    }

    public void setVendas(double vendas) {
        this.vendas = vendas;
    }
}
