package DesafioControleFluxo;

import java.util.Scanner;

public class Contador {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();

        try {
            contar(numero1, numero2);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }

    public static void contar(int numero1, int numero2) throws ParametrosInvalidosException{
        if (numero1 > numero2) {
            throw new ParametrosInvalidosException("O segundo parametro deve ser maior que o primeiro");   
        }

        int contagem = numero2 - numero1;

        System.out.println("Diferença " + contagem);

        for(int i = numero1; i <= numero2; i++)
            System.out.println("Numero: " + i);
        
    }
}
