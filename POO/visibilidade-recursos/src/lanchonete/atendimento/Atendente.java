package lanchonete.atendimento;

public class Atendente {
    
    public void servindoMesa() {
        System.out.println("Servindo mesa");
        pegarLancheCozinha(); // Antes de Servir a mesa preciso pegar lanche na cozinha
     }

     private void pegarLancheCozinha() {
        System.out.println("Pegando lanche cozinha");
     }

     public void receberPagamento() {
        System.out.println("Recebendo pagamento");
     }

      void trocarGas() { //tirei de public fica como default pois ele troca o gas para o cozinheiro e somente o pacote precisa conhecer
        System.out.println("Atendente trocando o gas");
     }

     private void pegarPedidoBalcao() {
        System.out.println("Pegando o pedido no Balcao");
     }
}
