public class ContaPoupanca  extends Conta{

    public void imprimirExtrato() { //obrigado a colocar pois esta na interface 
        System.out.println(" === Extrato Conta Popuança === ");
        super.imprimirInfosComuns(); //Acessando para imprimir as informaçoes
       }

  
}