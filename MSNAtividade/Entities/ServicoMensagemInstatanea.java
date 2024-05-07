package MSNAtividade.Entities;

public class ServicoMensagemInstatanea{
    
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Enviando mensagem");
        salvarHistoricoMensagem();
    }

    public void receberMensagem(){
        validarConectadoInternet();
        System.out.println("Recebendo a mensagem");
        salvarHistoricoMensagem(); 
    }

    private void validarConectadoInternet(){
        System.out.println("Validando se está conectado a internet");
    }

    protected void salvarHistoricoMensagem(){
        System.out.println("Salvando o Historico da mensagem");
    }

    public void printar(){
        System.out.println("Serviço de mensagem");
    }
}
