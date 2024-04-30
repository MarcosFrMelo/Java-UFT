package Aula3004;

abstract class Veiculo {
    private String chassi;

    public void ligar(){
        confereCombustivel();
        confereCambio();
        System.out.println("Automovel LIGADO");
    }

    private void confereCombustivel(){
        System.out.println("Conferindo combustivel");
    }

    private void confereCambio(){
        System.out.println("Câbio no P ta ok");
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
}
