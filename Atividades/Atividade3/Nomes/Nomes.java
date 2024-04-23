package Atividades.Atividade3.Nomes;

import java.util.Scanner;

public class Nomes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[10];
        for(int i = 0; i < 10; i++){
            nomes[i] = scanner.nextLine();
        }
        
        System.out.printf("3° Nome: %s", nomes[2]);
        System.out.printf("7° Nome: %s", nomes[6]);
        System.out.printf("9° Nome: %s", nomes[8]);
    }
    
}
/**
 * 
 */