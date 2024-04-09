package TvAtividade.Program;

import TvAtividade.Entidades.Tv;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        Tv tv = new Tv();
        int opcao;

        do {

        System.out.println("""
        Insira a opcao que deseja
        1 - aumentar volume
        2 - diminuir volume
        3 - ligar Tv
        4 - desligar Tv
        5 - passar canal
        6 - voltar canal
        7 - sair
        """);
        opcao = scanner.nextInt();
        switch (opcao){
            case 1:
                tv.aumentarVolume();
                break;
            case 2:
                tv.diminuirVolume();
                break;
            case 3:
                System.out.println("Escolhe um volume:");
                int volume = scanner.nextInt();
                tv.escolherVolume(volume);
                break; 
            case 4:
                tv.ligarTv();
                break;
            case 5:
                tv.desligarTv();
                break;
            case 6:
                tv.passarCanal();
                break;
            case 7:
                tv.voltarCanal();
                break;
            case 8:
                System.out.println("Escolha um canal que deseja:");
                int canal = scanner.nextInt();
                tv.mudarCanal(canal);
                break;
            case 9:
                System.out.println("Saindo");
                return;
            default:
                System.out.println("Opcao nao existe");
        }
        }while (true);
    }
}
