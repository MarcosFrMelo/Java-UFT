package ClasseGenerica.Atividade2.Aplicacao;

import ClasseGenerica.Atividade2.Entidade.Cliente;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        Cliente cliente = new Cliente();
        System.out.println("Insira o nome do cliente");
        String nome = scanner.nextLine();
        cliente.setNome(nome);

        System.out.println("Insira a despesa do cliente " + cliente.getNome());
        double despesas = scanner.nextDouble();
        cliente.setDespesas(despesas);

        System.out.println("Nome do cliente: " + cliente.getNome() + "\nGorjeta a ser pago pelo cliente: " + cliente.gorjeta());
        scanner.close();
    }
}
