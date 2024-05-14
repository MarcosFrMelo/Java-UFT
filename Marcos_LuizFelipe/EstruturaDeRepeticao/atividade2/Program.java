package EstruturaDeRepeticao.atividade2;

public class Program {
    public static void main(String[] args) {
        
        double soma = 0, qty = 0;
        for (int i = 501; i < 700; i++) {
            soma += i;
            qty++;
        }
        double media = soma/qty;
        System.out.println(media);
    }
}
