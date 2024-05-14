package Heranca.Atividade1.Entidades;

public class Vendedor extends Funcionario {
    private double commissao;

    public Vendedor() {
    }

    public Vendedor(String nome, String RG, double vendas, double commissao) {
        super(nome, RG, vendas);
        this.commissao = commissao;
    }

    public double getCommissao() {
        return commissao;
    }

    public void setCommissao(double commissao) {
        this.commissao = commissao;
    }

    public double calcularComissao(){
        commissao = vendas * 0.05;
        return commissao;
    }
}
