public class ContaCorrente extends Conta{

   public void imprimirExtrato() { //obrigado a colocar pois esta na interface 
    System.out.println(" === Extrato Conta Corrente === ");
   super.imprimirInfosComuns(); //Acessando para imprimir as informaçoes

   }
   

}
