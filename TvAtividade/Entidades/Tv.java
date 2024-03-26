package TvAtividade.Entidades;

public class Tv {
    private boolean ligada = false;
    private int canal = 0;
    private int volume = 20;

    public Tv(boolean ligada, int canal, int volume) {
        this.ligada = ligada;
        this.canal = canal;
        this.volume = volume;
    }

    public void aumentarVolume(){
        volume++;
    }
    public void diminuirVolume(){
        volume--;
    }
    public void passarCanal(){
        canal++;
    }
    public void voltarCanal(){
        canal--;
    }
    public void desligarTv(){
        ligada = false;
    }
    public void ligarTv(){
        ligada = true;
    }

    public boolean isLigada() {
        return ligada;
    }

    public int getCanal() {
        return canal;
    }

    public int getVolume() {
        return volume;
    }
}
