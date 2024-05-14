package EstruturaDeRepeticao.atividade3;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        double numero = scanner.nextInt();
        System.out.println(fatorial(numero));
        scanner.close();
    }

    public static double fatorial(double numero){   //acima de 170, infinity
        if (numero != 1)
            return numero * fatorial(numero-1);     //limite de 11560
        else
            return numero;
    }
}
