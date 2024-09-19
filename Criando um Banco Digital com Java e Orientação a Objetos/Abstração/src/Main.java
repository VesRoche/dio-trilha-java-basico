public class Main {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        cc.depositar(100); //depositando na conta corrente
      

         Conta poupanca = new ContaCorrente();
       
         cc.transferir(100, poupanca); // preciso passar aqui pois preciso da poupança instanciada passei o valor para a poupança e tirei da conta corrente
        //  poupanca.transferir(100, cc); //Posso inverter tambem


       cc.imprimirExtrato();
       poupanca.imprimirExtrato();

    }
}
