package questao2.programa;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import questao1.entidades.Data;
import questao2.entidades.Voo;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate;
        Data data = new Data();
        localDate = LocalDate.parse("05/10/2003", fmt01);
        data.setData(localDate);
        Voo voo = new Voo();
        voo.setNumeroDoVoo(1500);
        voo.setData(data);
        System.out.println("cadeira livre mais proxima" + voo.cadeiraLivre());
        System.out.println("Todas as cadeiras livres: " + voo.cadeirasVagas());

        System.out.println("Cadeira expecifica ocupada: " + voo.verificarOcupacao(12));
        System.out.println("ocupar cadeira expecifica: " + voo.ocuparCadeira(12));
        System.out.println("Cadeira expecifica ocupada: " + voo.verificarOcupacao(12));
        System.out.println("Numero do voo: " + voo.getNumeroDoVoo());
        voo.getData().printarData();

        Voo voo2 = voo.clone();
    }
}
