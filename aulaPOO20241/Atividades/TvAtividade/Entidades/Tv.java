package TvAtividade.Entidades;

public class Tv {
    private boolean ligada = false;
    private int canal = 1;
    private int volume = 20;

    public Tv() {
    }

    public void aumentarVolume() {
        if (ligada) {
            if (volume < 100) {
                volume++;
                System.out.println("Volume atual: " + volume);
            }
            else
                System.out.println("volume maximo atingido");
                System.out.println("Volume atual: " + volume);
        }
        else
            System.out.println("Tv desligada");
    }

    public void diminuirVolume() {
        if (ligada) {
            if (volume > 0) {
                volume--;
                System.out.println("Volume atual: " + volume);
            }
            else
                System.out.println("Volume esta no minimo");
                System.out.println("Volume atual: " + volume);
        }
        else
            System.out.println("Tv desligada");
    }

    public void escolherVolume(int volume){
        if (ligada) {
            if (volume >= 0 && volume <=100 ) {
                this.volume = volume;
                System.out.println("Volume atual: " + volume);
            }
            else
                System.out.println("Volume escolhido esta fora dos limites");
        }
    }

    public void mudarCanal(int canal){
        if (ligada) {
            if (canal > 0 && canal < 1000) {
                this.canal = canal;
                System.out.println("Canal atual: " + this.canal);
            }
            else
                System.out.println("Canal escolhido esta fora dos limites");
                System.out.println("Canal atual: " + this.canal);
        }
        else
            System.out.println("Tv desligada");
    }

    public void passarCanal() {
        if (ligada) {
            if (canal < 1000) {
                canal++;
                System.out.println("Canal atual: " + this.canal);
            }
            else
                System.out.println("Canal no maximo possivel");
                System.out.println("Canal atual: " + this.canal);
        }
        else
            System.out.println("Tv desligada");
    }

    public void voltarCanal() {
        if (ligada) {
            if (canal > 0) {
                canal--;
                System.out.println("Canal atual: " + this.canal);
            }
            else
                System.out.println("canal no minimo possivel");
                System.out.println("Canal atual: " + this.canal);
        }
        else
            System.out.println("Tv desligada");
    }

    public void desligarTv() {
        if (ligada) {
            ligada = false;
        }
        else
            System.out.println("Tv desligada");
    }

    public void ligarTv() {
        if (ligada == false) {
            ligada = true;
        }
        else
            System.out.println("Tv ligada");
    }

    public boolean getLigada() {
        return ligada;
    }

    public int getCanal() {
        return canal;
    }

    public int getVolume() {
        return volume;
    }

}
