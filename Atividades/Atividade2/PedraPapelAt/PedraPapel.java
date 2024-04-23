package Atividades.Atividade2.PedraPapelAt;

import java.util.Scanner;

public class PedraPapel {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String jogador1, jogador2;

        System.out.println("Insira quantos jogos vcs irão realizar");
        int n = scanner.nextInt();

        for(int i = 0; i < n; i++){
            
            try{
                System.out.println("Jogador 1, insira a opção que deseja(ataque, papel, pedra)");
                jogador1 = scanner.next();

                System.out.println("Jogador 2, insira a opção que deseja(ataque, papel, pedra)");
                jogador2 = scanner.next();
            } catch(Exception e){
                System.out.println("As repostas devem ser escritas com ");
            }



        }


    }
    
}
