package ClasseGenerica.Atividade1.Aplicacao;

import ClasseGenerica.Atividade1.Entidades.Empregado;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Empregado empregado = new Empregado();
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Insira o nome do empregado");
        String nome = scanner.nextLine();
        empregado.setNome(nome);

        System.out.println("Insira o salário do empregado " + empregado.getNome());
        double salario = scanner.nextDouble();
        empregado.setSalario(salario);
        
        System.out.println("Nome do empregado: " + empregado.getNome() + "\neImposto de renda a ser pago pelo empregado: " + empregado.calcularImposto());
        scanner.close();
    }
}
