package MSNMessager.Abstracao;

public class FacebookMessager extends ServicoMensagemInstantanea {
   
    public void enviarMensagem() {      //Preciso implementar os metodos abstratos do Servico Mensagem

        System.out.println("Enviando mensagem pelo Facebook");
    }

    public void receberMensagem() {//Preciso implementar os metodos abstratos do Servico Mensagem
        System.out.println("Recebendo mensagem pelo Facebook");
    }
}
