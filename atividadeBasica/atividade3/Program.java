package atividadeBasica.atividade3;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        int numero = scanner.nextInt();
        int mult;
        mult = fatorial(numero);
        System.out.println(mult);
        scanner.close();
    }

    public static int fatorial(int numero){
        if (numero != 1)
            return numero * fatorial(numero-1);
        else
            return numero;
    }
}
