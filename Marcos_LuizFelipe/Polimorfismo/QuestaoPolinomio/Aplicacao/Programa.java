package Polimorfismo.QuestaoPolinomio.Aplicacao;

import java.util.Locale;
import java.util.Scanner;

import Polimorfismo.QuestaoPolinomio.Entidades.Polinomio;
import Polimorfismo.QuestaoPolinomio.Entidades.Termo;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        Polinomio polinomio = new Polinomio();
        Termo termo = new Termo();
        Boolean criou = false;
        do{
            System.out.println("Insira a opçao que deseja\n1 - insirir novo elemente\n2 - Somar Resultado\n3 - sair");
            int op = scanner.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Valor de a");
                    double a = scanner.nextDouble();

                    System.out.println("Valor do expoente");
                    double expoente = scanner.nextDouble();
                    
                    termo = new Termo(a, expoente);

                    polinomio.setTermos(termo);
                    criou = true;
                    break;
                case 2:
                    if (criou == true) {
                        System.out.println("Insira o valor de X");
                        double x = scanner.nextDouble();

                        System.out.println("Soma do polinomio: " + polinomio.calularPolinomio(x));
                    }
                    else
                        System.out.println("Insira pelo menos um elemento no polinomio");
                        break;
                default:
                    System.out.println("sem op");
                    break;
            }
        }while(true);
    }
}
