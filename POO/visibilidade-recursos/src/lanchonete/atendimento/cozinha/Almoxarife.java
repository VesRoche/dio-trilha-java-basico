package lanchonete.atendimento.cozinha;


public class Almoxarife {
    
    private void controlarEntrada() {
       System.out.println("Controlando a Entrada dos itens");
    }

    private void controlarSaida() {
        System.out.println("Controlando a Saida dos itens");
     }

      void entregarIngredientes() { // tirei de public fica como default pois é Açoes somente o pacote da cozinha precisa conhecer
         
        System.out.println("Entregando ingredientes");
//vou controlar a entrada e a saida dos ingredientes quando os ingredientes estiverem entregues
//IMPORTANTE : Metodo Default somente pessoas do seu pacote consegue acessar e suas classes tambem

     }

      void trocarGas() {// tirei de public fica como default pois é Açoes somente o pacote da cozinha precisa conhecer
        System.out.println("Almoxarife Trocando o gas");
     }
}
