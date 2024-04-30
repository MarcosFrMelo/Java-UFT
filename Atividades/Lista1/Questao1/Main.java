package Atividades.Lista1.Questao1;

import java.util.Locale;
import java.util.Scanner;

import Atividades.Lista1.Questao1.entities.Aluno;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        float prova1, prova2, trabalho;
        String nome, matricula;

        System.out.println("Insira o nome do aluno:");
        nome = scanner.nextLine();

        System.out.println("Insira a matricula do aluno " + nome);
        matricula = scanner.nextLine();

        Aluno aluno = new Aluno(matricula, nome);

        System.out.println("Insira a nota da primeira prova do aluno: " + aluno.getNome());
        prova1 = scanner.nextFloat();

        System.out.println("Insira a segunda nota da prova do aluno: " + aluno.getNome());
        prova2 = scanner.nextFloat();

        aluno.setNotaProva1(prova1);
        aluno.setNotaProva2(prova2);
    
        System.out.println("Insira a nota do trabalho:");
        trabalho = scanner.nextFloat();

        aluno.setNotaTrabalho(trabalho);

        System.out.println("Media final do aluno: " + aluno.calcularMedia());
        if (aluno.calcularMedia() >= 7) {
            
        }
    }
}
