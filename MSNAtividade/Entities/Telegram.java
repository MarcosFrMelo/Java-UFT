package MSNAtividade.Entities;

public class Telegram extends ServicoMensagemInstatanea {
    @Override
    public void printar(){
        System.out.println("telegram");
        salvarHistoricoMensagem();
    }
}
