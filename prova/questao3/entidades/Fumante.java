package questao3.entidades;

import questao1.entidades.Data;
import questao2.entidades.Voo;

public class Fumante extends Voo {
    private int cadeirasFumante;

    public Fumante(Integer[] assentos, Data data, int passageiros, int numeroDoVoo, int cadeirasFumante, int numeroMaximoPassagerio) {
        super(assentos, data, passageiros, numeroDoVoo, numeroMaximoPassagerio);
        this.cadeirasFumante = cadeirasFumante;
    }

    public Fumante() {
    }

    public int getCadeirasFumante() {
        return cadeirasFumante;
    }

    public void setCadeirasFumante(int cadeirasFumante) {
        this.cadeirasFumante = cadeirasFumante;
    }  

    public char tipoCadeira(int numeroCadeira){
        return numeroCadeira > (numeroMaximoPassagerio - cadeirasFumante)? 'F' : 'N';
    }

    public int cadeiraFumantePosicao(){
        int resultado = (numeroMaximoPassagerio - cadeirasFumante);
        return resultado;
    }
}
