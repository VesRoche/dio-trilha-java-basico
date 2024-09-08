package MSNMessager.Encapsulamento;

public class MSNMessager {
    public void enviarMensagem() {
        validarConectadoInternet();//Encapsulamento ninguem precisa saber visiveis somente na classe
        salvarHistoricoMensagem();//Encapsulamento ninguem precisa saber  visiveis somente na classe
        System.out.println("Enviando Mensagem");
    }

    public void receberMensagem() {
        System.out.println("Recebendo Mensagem");
    }

    private void validarConectadoInternet() { //Encapsulamento ninguem precisa saber visiveis somente na classe, 
        System.out.println("Validando se está conectado");
    }

    private void salvarHistoricoMensagem() {//Encapsulamento ninguem precisa saber  visiveis somente na classe
        System.out.println("Salvando Histórico da Mensagem");
    }
}
