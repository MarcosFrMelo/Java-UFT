package questao4.programa;

import java.util.Scanner;

import questao4.entidades.CaminhaoAlfa;
import questao4.entidades.CaminhaoBeta;
import questao4.entidades.Pluviometro;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CaminhaoAlfa caminhaoAlfa = new CaminhaoAlfa();
        CaminhaoBeta caminhaoBeta = new CaminhaoBeta();
        Pluviometro pluviometro = new Pluviometro();
        do {
            
            System.out.println("Tipo do pluvi");
            String nome = scanner.nextLine();
            System.out.println("Insi peso:");
            double peso = scanner.nextDouble();
            pluviometro.setPeso(peso);
            pluviometro.setTipo(nome);
            caminhaoBeta.inserePluviometro(pluviometro);
            System.out.println("Tipos: " + caminhaoBeta.getQty());
            caminhaoAlfa.inserePluviometro(pluviometro);
            System.out.println("Peso: " + caminhaoAlfa.getPeso());
            scanner.nextLine();
            System.out.println("DEseja parar");
            int op = scanner.nextInt();
            if (op == 1) {
                return;
            }
            scanner.nextLine();
        } while (true);
    }
}
