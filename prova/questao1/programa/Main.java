package questao1.programa;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import questao1.entidades.Data;

class Main {
    public static void main(String[] args) {
        DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Data data = new Data();
        LocalDate localDate;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira uma data  (dd/MM/yyyy)");
        String input = scanner.nextLine();

        localDate = LocalDate.parse(input, fmt01);

        data = new Data(localDate);

        System.out.println("Dia da data: " + data.getDia());
        System.out.println("Mes da data: " + data.getMes());
        System.out.println("Ano da data: " + data.getAno());
        System.out.println("Mes por exteso: " + data.getMesExtenso());
        System.out.println("Ano par? " + data.anoParOuImpar());
        LocalDate localDate2;
    

        localDate2 = LocalDate.parse("11/04/2005", fmt01);
        LocalDate localDate3;
        System.out.println("compara: " + data.compara(localDate2));
        
        localDate3 = data.cloneData(localDate2);
        System.out.println(localDate2);
        System.out.println(localDate3);
    }
}