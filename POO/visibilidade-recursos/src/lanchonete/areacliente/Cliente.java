package lanchonete.areacliente;

public class Cliente {
    
    public void escolherLanche() {
        System.out.println("Escolhendo Lanche");
     }

     public void fazerPedido() {
        System.out.println("Fazendo Pedido");
     }

     public void pagarConta() {
      consultarSaldoAplicativo(); // Antes de pagar a conta precisa consultar o saldo
        System.out.println("Pagando a conta");
     }

     private void consultarSaldoAplicativo() {
        System.out.println("Consultado Saldo no Aplicativo");
     }

     
}
