package ensinoMedio;

public class Escola {
    public static void main(String[] args) {
        Aluno italo = new Aluno();
        italo.setIdade(8);
        italo.setNome("Viada");
        System.out.println("Idade do aluno: " + italo.getIdade() + "\nNome do aluno: " + italo.getNome());
    }
}
