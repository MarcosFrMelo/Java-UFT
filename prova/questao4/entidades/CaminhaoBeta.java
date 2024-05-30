package questao4.entidades;

import java.util.ArrayList;
import java.util.List;

public class CaminhaoBeta extends Caminhao {
    private List<Pluviometro> pluviometros = new ArrayList<>();
    private int qty;
    public List<Pluviometro> getPluviometros() {
        return pluviometros;
    }

    public CaminhaoBeta(){
        this.qty = 0;
    }

    @Override
    public void inserePluviometro(Pluviometro pluviometro2){
        boolean igual = false;
        for (Pluviometro pluviometro : pluviometros) {
            if (pluviometro.getTipo().equals(pluviometro2.getTipo())) {
                igual = true;
            }
        }
        if (igual == false) {
            pluviometros.add(pluviometro2);
            this.qty++;
        }
    }

    public void printarLista(){
        for (Pluviometro pluviometro : pluviometros) {
            System.out.println("Tipo do pluviometro: " + pluviometro.getTipo());
    }
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    
    
}
