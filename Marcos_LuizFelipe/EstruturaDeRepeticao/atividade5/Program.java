package EstruturaDeRepeticao.atividade5;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        int soma = 0;
        Scanner scanner = new Scanner(System.in);
        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();
        if (numero1 > numero2) {
            int temp = numero1;
            numero1 = numero2;
            numero2 = temp;
        }
        for (int i = numero1; i <= numero2; i++) 
            soma += i;
        System.out.println(soma);
        scanner.close();
    }
}
