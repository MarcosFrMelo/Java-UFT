import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        String[] nomes = {"Marcos", "jhennifer", "Italo", "Luis", "Thomaz","Luiz Gustavo","Maria Clara","Guilherme","Klaus","Kawan"};
        Double[] salarioDoCandidato = new Double[10];
        String[] candidatosSelecionados = new String[5];

        for(int i = 0; i < nomes.length; i++)
            salarioDoCandidato[i] = caso2();

        int numero;
        int max = 0;

        for(int i = 0; i < nomes.length; i++){
            numero = caso1(salarioDoCandidato[i]);
            if (numero == 1){
                printarMensagem(nomes[i], salarioDoCandidato[i]);
                candidatosSelecionados[i] = nomes[i];
            }
            else if (numero == 2){
                printarMensagem(nomes[i], salarioDoCandidato[i]);
                candidatosSelecionados[i] = nomes[i];
            }
            max++;
            if (max == 5) {
                break;
            }
        }
        for (String candidatos : candidatosSelecionados) {
            caso4(candidatosSelecionados);            
        }
        scanner.close();
    }
        
    public static int caso1(Double salarioDoCandidato){
        if (2000.00 > salarioDoCandidato) 
            return 1;
        else if (2000.00 < salarioDoCandidato)
            return 2;
        else
            return 3;
    }
        
    public static Double caso2(){
       return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
        
    public static void printarMensagem(String nome, double salarioDoCandidato){
        System.out.println("Nome: " + nome);
        System.out.println("Salario pretendido: " + salarioDoCandidato);
        System.out.println("Ligar para o candidato");

    }
    public static void caso4(String nomeCandidato[]){
        int numeroTentativa;
        boolean simOuNao;
        for(int i = 0; i < 3; i++){
            numeroTentativa = ThreadLocalRandom.current().nextInt(0, 1);
        }
        if () {
            
        }

    }

}