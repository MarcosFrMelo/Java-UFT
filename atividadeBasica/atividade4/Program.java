package atividadeBasica.atividade4;

public class Program {
    public static void main(String[] args) {
        int soma = 0;
        for (int i = 100; i <= 500 ; i++) {
            if ((i % 2) == 0) {
                soma += i;   
            }
        }
        System.out.println(soma);
    }
}
