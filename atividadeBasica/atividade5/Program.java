package atividadeBasica.atividade5;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        int soma = 0;
        Scanner scanner = new Scanner(System.in);
        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();
        if (numero1 > numero2) {
            System.out.println("Numero 1 deve ser menor");
            scanner.close();
            return;
        }
        for (int i = numero1; i <= numero2; i++) 
            soma += i;
        System.out.println(soma);
        scanner.close();
    }
}
