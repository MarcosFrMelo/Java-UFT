package ClasseGenerica.Atividade2.Entidade;

public class Cliente {
    private String nome;
    private double despesas;

    public Cliente() {
    }    

    public Cliente(String nome, double despesas) {
        this.nome = nome;
        this.despesas = despesas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDespesas() {
        return despesas;
    }

    public void setDespesas(double despesas) {
        this.despesas = despesas;
    }

    public double gorjeta(){
        return despesas * 0.10;
    }
}
