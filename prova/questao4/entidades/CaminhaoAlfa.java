package questao4.entidades;

import java.util.ArrayList;
import java.util.List;

public class CaminhaoAlfa extends Caminhao {
    private double peso;
    private List<Pluviometro> pluviometros = new ArrayList<>();

    public CaminhaoAlfa(){
        this.peso = 0;
    }

    public CaminhaoAlfa(double peso) {
        this.peso = peso;
    }
    
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public void inserePluviometro(Pluviometro pluviometro2){
        if (peso + pluviometro2.getPeso() < 5000){
            pluviometros.add(pluviometro2);
            this.peso += pluviometro2.getPeso();
        }  
    }

    

}
