package AtividadesSala;
//alt shift "o" para importar automaticamente 
import java.util.Scanner;

public class NotaAluno {
    public static void main(String[] args) {
        int nota = 6;
        Scanner scanner = new Scanner(System.in);
        String resultado = nota >=7 ? "Aprovado" : nota < 5 ? "Reprovado" : "Recuperação";
        System.out.println(resultado);
        System.out.println("asd" + "asd");

        String nomes[] = {"MArcos", "Italo", "jhennifer", "Luis", "Thomaz", "Guilherme", "Brito"};
        
        for(int x = 0; x<nomes.length; x++){
            System.out.println("Nome do indice " + x + " é " + nomes[x]);
        }
    }
}
