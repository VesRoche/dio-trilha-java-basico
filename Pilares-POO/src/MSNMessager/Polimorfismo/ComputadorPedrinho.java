package MSNMessager.Polimorfismo;

import MSNMessager.Polimorfismo.Apps.FacebookMessager;
import MSNMessager.Polimorfismo.Apps.MsnMessager;
import MSNMessager.Polimorfismo.Apps.ServicoMensagemInstantanea;
import MSNMessager.Polimorfismo.Apps.Telegram;

public class ComputadorPedrinho {
    public static void main(String[] args) {
      ServicoMensagemInstantanea smi = null;
// Nao sei quem é mais quando exeutar ele vai me dar uma mesma proposta de comportamento com as suas particularidades
      
      String appEscolhido = "fbm";

      if(appEscolhido.equals("msn"))
      smi = new MsnMessager();
      if(appEscolhido.equals("fbm"))
      smi = new FacebookMessager();
      if(appEscolhido.equals("tlg"))
      smi = new Telegram();

      smi.enviarMensagem();
      smi.receberMensagem();


      // Com o modificador private somente a classe conhece a implementacao
      //O public todos passarao a conhecer
      //somente as classes filhas e classe do mesmo pacote soubessem protected
}
}