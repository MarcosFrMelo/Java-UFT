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

        String resultado = (teste==teste2) ? "verdadeiro" : "false";
        System.out.println(resultado);

        String nome1 = "JAVA";
        String nome2 = "JAVA";
        System.out.println(nome1.equals(nome2));
        String nome3 = new String("JAVA");
        //System.out.println(nome3);
        //System.out.println(nome3.equals(nome1));
        String nome4 = nome3;
        System.out.println(nome3.equals(nome4));
        int numero1 = 130;
        Integer numero2 = 130;
        System.out.println(numero2.toString());
        System.out.println(numero1 == numero2);

        int num1 = 1;
        int num2 = 1;
        if (num1 == 2 & num2  ==2){
            System.out.println("VERDAEIROOOOO");
        }
        else{
            System.out.println("FALSSOO");
        }
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
    }
}

