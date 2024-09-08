package MSNMessager.Polimorfismo.Apps;

public class Telegram  extends ServicoMensagemInstantanea{//Herança herda de ServicoMensagemInstantanea
    public void enviarMensagem() {      //Preciso implementar os metodos abstratos do Servico Mensagem
        validarConectadoInternet(); // Antes de enviar ou receber mensagem preciso verificar se tem internet, como foi colocado protected entao os filhos e classe do mesmo pacote poderao ter acesso por isso eu criei uma pasta app pois assim o Computador do pedrinho nao consegue acessar o metodo protected
        System.out.println("Enviando mensagem pelo Telegram");
        
    }

    public void receberMensagem() {//Preciso implementar os metodos abstratos do Servico Mensagem
        System.out.println("Enviando mensagem pelo Telegram");
    }
}
