package Heranca.Atividade1.Aplicacao;

import java.util.Locale;
import java.util.Scanner;

import Heranca.Atividade1.Entidades.Vendedor;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        Vendedor vendedor = new Vendedor();
        System.out.println("Insira o nome do Funcionario:");
        vendedor.setNome(scanner.nextLine());

        System.out.println("Insira o RG do funcionario " + vendedor.getNome());
        vendedor.setRG(scanner.nextLine());

        System.out.println("Insira o total de vendas do funcionario " + vendedor.getNome());
        vendedor.setVendas(scanner.nextDouble());

        System.out.printf("""
                Nome: %s
                Rg: %s
                Total de vendas: %.2f
                Commisao: %.2f
                """, vendedor.getNome(), vendedor.getRG(), vendedor.getVendas(), vendedor.calcularComissao());

        scanner.close();
    }
}
