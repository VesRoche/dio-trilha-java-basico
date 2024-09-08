package MSNMessager.Interface.Equipamentos.Multifuncional;

import MSNMessager.Interface.Equipamentos.Copiadora.Copiadora;
import MSNMessager.Interface.Equipamentos.Digitalizadora.Digitalizadora;
import MSNMessager.Interface.Equipamentos.Impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {//Nao permite herança multipla ou seja herança varias heranças mas interface sim

    public void copiar() {
        System.out.println("Copiando via equipamento MultiFuncional");
       
    } 
    
    public void digitalizar() {
        System.out.println("Digitalizando via equipamento MultiFuncional");
       
    } 

    public void imprimir() {
        System.out.println("Imprimindo via equipamento MultiFuncional");
       
    }
}

    