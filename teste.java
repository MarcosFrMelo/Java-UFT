import java.util.Date;

public class teste {
    public static void main(String[] args) {
        Integer teste = 5;
        int teste2 = 80;
        teste.hashCode();
        teste.doubleValue();
        short numeroCurto = 1;
        System.out.println(numeroCurto );
        int numeroNormal = numeroCurto;
        System.out.println(numeroNormal);
        short numeroCurto2 = (short) numeroNormal;
        System.out.println(numeroCurto2);
        Date dataNascimento = new Date(1 -2-2024);
        System.out.println(dataNascimento);

        String concatenacao = "1"+1+1+1;
        teste++;
        System.out.println(teste++);
        System.out.println(teste);
        boolean eae = true;
        System.out.println("inverteu?:" + !eae);
    }
}

