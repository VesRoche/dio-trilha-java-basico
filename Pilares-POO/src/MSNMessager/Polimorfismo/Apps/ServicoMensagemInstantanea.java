package MSNMessager.Polimorfismo.Apps;

public abstract class  ServicoMensagemInstantanea { //Quem quiser ser um servico precisa implemenntar esses dois contratos ou seja esses dois metodos

public abstract void enviarMensagem();
public abstract void receberMensagem();

//Somente os filhos conhecem este método
protected void validarConectadoInternet() {
    System.out.println("Validando se está conectado a Internet");
}

}

