package MSNMessager.Abstracao;

abstract class  ServicoMensagemInstantanea { //Quem quiser ser um servico precisa implemenntar esses dois contratos ou seja esses dois metodos

public abstract void enviarMensagem();
public abstract void receberMensagem();
}