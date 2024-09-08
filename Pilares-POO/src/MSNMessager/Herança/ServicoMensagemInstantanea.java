package MSNMessager.Herança;

class ServicoMensagemInstantanea {

    public void enviarMensagem() {
        validarConectadoInternet();//Confirma se esta conectado a internet
        System.out.println("Enviando Mensagem");
        salvarHistoricoMensagem();//Salva Historico
        
    }

    public void receberMensagem() {
        System.out.println("Recebendo Mensagem ");
    }

    private void validarConectadoInternet() { //Encapsulamento ninguem precisa saber visiveis somente na classe, 
        System.out.println("Validando se está conectado");
    }

    private void salvarHistoricoMensagem() {//Encapsulamento ninguem precisa saber  visiveis somente na classe
        System.out.println("Salvando Histórico da Mensagem");
    }
}