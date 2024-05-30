package questao2.entidades;

import questao1.entidades.Data;

public class Voo {
    protected Integer[] assentos = new Integer[10000];
    protected Data data = new Data();
    protected int passageiros;
    protected int numeroDoVoo;
    protected int numeroMaximoPassagerio = 100;
    
    public Voo(Integer[] assentos, Data data, int passageiros, int numeroDoVoo, int numeroMaximoPassagerio) {
        this.assentos = assentos;
        this.data = data;
        this.passageiros = passageiros;
        this.numeroDoVoo = numeroDoVoo;
        this.numeroMaximoPassagerio = numeroMaximoPassagerio;
    }
    public Voo() {
        for (int i = 0; i < assentos.length; i++) {
            assentos[i] = 0;
        }
    }
    public Integer[] getAssentos() {
        return assentos;
    }
    public void setAssentos(Integer[] assentos) {
        this.assentos = assentos;
    }
    public Data getData() {
        return data;
    }
    public void setData(Data data) {
        this.data = data;
    }
    public int getPassageiros() {
        return passageiros;
    }
    public void setPassageiros(int passageiros) {
        this.passageiros = passageiros;
    }
    
    public int getNumeroDoVoo() {
        return numeroDoVoo;
    }
    public void setNumeroDoVoo(int numeroDoVoo) {
        this.numeroDoVoo = numeroDoVoo;
    }

    public int cadeiraLivre(){
        for (int i = 0; i < numeroMaximoPassagerio; i++) {
            if (assentos[i] == 0)
                return i+1;
        }
        return 0;
    }

    public boolean verificarOcupacao(int cadeira){
        return assentos[cadeira] == 1? true : false;
    }

    public int cadeirasVagas(){
        int qty = 0;
        for (int i = 0; i < numeroMaximoPassagerio; i++) {
            if (assentos[i] == 0)
                qty++;
        }
        return qty;
    }

    public Voo clone(){
        Voo voo2 = new Voo(this.assentos, this.data, this.passageiros, this.numeroDoVoo, this.numeroMaximoPassagerio);
        return voo2;
    }

    public boolean ocuparCadeira(int cadeira){
        if (!verificarOcupacao(cadeira)) {
            assentos[cadeira] = 1;
            return true;
        }
        return false;
    }

    public int getNumeroMaximoPassagerio() {
        return numeroMaximoPassagerio;
    }
    public void setNumeroMaximoPassagerio(int numeroMaximoPassagerio) {
        this.numeroMaximoPassagerio = numeroMaximoPassagerio;
    }

    

}
