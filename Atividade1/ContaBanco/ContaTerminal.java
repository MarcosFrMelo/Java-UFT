package ContaBanco;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o numero da conta: ");
        int numero = scanner.nextInt();

        System.out.println("Digite o numero da agencia: ");
        String agencia = scanner.next();

        scanner.nextLine();
        
        System.out.println("Digite o nome do titular: ");
        String nome = scanner.nextLine();
        
        System.out.println("Digite o saldo da conta: ");
        double saldo = scanner.nextDouble();

        System.out.printf(
            """
            Olá, %s, obrigado por criar uma conta em nosso banco
            Sua agência é: %s
            Conta: %d
            Seu saldo: R$%.2f já está disponível para saque
            """ , nome, agencia, numero, saldo);

        scanner.close();
    }
}
