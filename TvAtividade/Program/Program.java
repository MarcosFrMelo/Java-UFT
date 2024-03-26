package TvAtividade.Program;

import TvAtividade.Entidades.Tv;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tv tv = new Tv(true, 0, 20);
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
                System.out.println("Volume atual: " + tv.getVolume());
                break;
            case 2:
                tv.diminuirVolume();
                System.out.println("Volume atual: " + tv.getVolume());
                break;
            case 3:
                tv.ligarTv();
                System.out.println("Tv ligada");
                break;
            case 4:
                tv.desligarTv();
                System.out.println("Tv desligada");
                break;
            case 5:
                tv.passarCanal();
                System.out.println("Canal atual: " + tv.getCanal());
                break;
            case 6:
                tv.voltarCanal();
                System.out.println("Canal atual: " + tv.getCanal());
                break;
            case 7:
                System.out.println("Saindo");
                return;
            default:
                System.out.println("Opcao nao existente");


        }
        }while (true);
    }
}
