package MSNMessager.Interface.Equipamentos.Estabelecimento;

import MSNMessager.Interface.Equipamentos.Copiadora.Copiadora;
import MSNMessager.Interface.Equipamentos.Digitalizadora.Digitalizadora;
import MSNMessager.Interface.Equipamentos.Impressora.Impressora;
import MSNMessager.Interface.Equipamentos.Multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();
        //Deskjet deskjet = new Deskjet();

       Impressora impressora = em;
       Digitalizadora digitalizadora = em; // notasse que o objeto deskjet eu nao consigo acessar na digitalizadora, isso por que a classe nao ta implementada em digitalizadora e sim na impressora
       Copiadora copiadora = em;
       // notasse que o objeto deskjet eu nao consigo acessar na copiadora, isso por que a classe nao ta implementada em copiadora e sim na impressora
       
       impressora.imprimir();
       digitalizadora.digitalizar();
       copiadora.copiar();
    }
}
