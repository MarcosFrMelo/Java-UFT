package Atividades.Lista1.Questao1.entities;

public class Aluno {
    private String matricula;
    private String nome;
    private float notaProva1, notaProva2, notaTrabalho;

    public Aluno(String matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public float getNotaProva1() {
        return notaProva1;
    }

    public void setNotaProva1(float notaProva1) {
        this.notaProva1 = notaProva1;
    }

    public float getNotaProva2() {
        return notaProva2;
    }

    public void setNotaProva2(float notaProva2) {
        this.notaProva2 = notaProva2;
    }

    public float getNotaTrabalho() {
        return notaTrabalho;
    }

    public void setNotaTrabalho(float notaTrabalho) {
        this.notaTrabalho = notaTrabalho;
    }

    public double calcularMedia(){
        double media = (notaProva1 + 2.5) + (notaProva2 + 2.5) + (notaTrabalho + 2);
        return media;
    }

    public double calculoProvaFinal(){
        double media = calcularMedia();
        if (media < 4 && media >= 7)
            return 0;
        else 
            return 10 - media;
    }
}
