package AtividadesSala;

public class NotaAluno {
    public static void main(String[] args) {
        int nota = 9;

        if (nota >= 7)
            System.out.println("Aprovado");
        else if(nota < 5)
            System.out.println("Reprovado"); 
        else
            System.out.println("Recuperação");
            
    }
}
