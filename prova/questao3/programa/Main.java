package questao3.programa;

import questao3.entidades.Fumante;

public class Main {
    public static void main(String[] args) {
        Integer[] integer = new Integer[800];
        for (int i = 0; i < integer.length; i++) {
            integer[i] = 0;
        }
        Fumante fumante = new Fumante();

        fumante.setNumeroMaximoPassagerio(500);
        fumante.setCadeirasFumante(120);
        System.out.println("Cadeiras fumantes a partir da cadeira numero: " + fumante.cadeiraFumantePosicao());

        System.out.println("Cadeira é do tipo: " + fumante.tipoCadeira(121));


    }
}
