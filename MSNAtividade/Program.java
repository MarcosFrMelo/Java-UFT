package MSNAtividade;

import java.util.Scanner;

import MSNAtividade.Entities.FacebookMensseger;
import MSNAtividade.Entities.MSNMessenger;
import MSNAtividade.Entities.ServicoMensagemInstatanea;
import MSNAtividade.Entities.Telegram;


public class Program {
    public static void main(String[] args) {
        // abrindo mensagem
        ServicoMensagemInstatanea smi = null;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um aplicativo");
        String appEscolhido = scanner.nextLine();

        if (appEscolhido.equals("msn")) 
            smi = new MSNMessenger();
        else if (appEscolhido.equals("fpm")) 
            smi = new FacebookMensseger();
        else if (appEscolhido.equals("tlg")) 
            smi = new Telegram();

        smi.enviarMensagem();
        smi.receberMensagem();
        scanner.close();
    }
}

/**
 * coito
 */