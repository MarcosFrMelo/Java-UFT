package Polimorfismo.QuestaoPolinomio.Entidades;

import java.util.ArrayList;
import java.util.List;

public class Polinomio {
    List<Termo> termos = new ArrayList<>();

    public Polinomio(Termo termo) {
        termos.add(termo);
    }

    public Polinomio() {
    }


    public boolean unificar(Termo termo){
        for (Termo atual : termos) {
            if (atual.getI() == termo.getI()) {
                atual.setA(atual.getA() + termo.getA());
                return true;
            } 
        }
        return false;
    }

    public void setTermos(Termo Termo){
        if (unificar(Termo) == false) {
            termos.add(Termo);
        }
    }
    
    public double calularPolinomio(double x){

        double soma = 0;
        
        for (Termo atual : termos) {
            soma = atual.calcula(x);
        }
        return soma;
    }


}
