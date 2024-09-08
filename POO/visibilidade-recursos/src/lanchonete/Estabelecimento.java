package lanchonete;

import lanchonete.areacliente.Cliente;
import lanchonete.atendimento.Atendente;
import lanchonete.atendimento.cozinha.Almoxarife;
import lanchonete.atendimento.cozinha.Cozinheiro;


public class Estabelecimento {

    public static void main(String[] args) {
        
    // Açoes nao precisa estar disponivel para toda aplicação  Utilizando o private que fica restrito
    Cozinheiro  cozinheiro = new Cozinheiro();
    // //cozinheiro.lavarIngredientes();
    // cozinheiro.baterVitaminaLiquidificador();
    // cozinheiro.selecionarIngredientesVitamina();
    // cozinheiro.prepararLanche();
    // cozinheiro.prepararVitamina();
    // cozinheiro.prepararVitamina();

// Açoes que o estabelecimento precisa ter ciencia
    cozinheiro.adicionarSucoNoBalcao();
    cozinheiro.adicionarLancheNoBalcao();
    cozinheiro.adicionarComboNoBalcao();


  // Açoes nao precisa estar disponivel para toda aplicação  
  // almoxarife.controlarEntrada();
  // almoxarife.controlarSaida();

    // // Açoes somente o pacote da cozinha precisa conhecer,tiro esas visibilidade
    // almoxarife.entregarIngredientes();
    // almoxarife.trocarGas();

    Atendente  atendente = new Atendente();
//atendente.pegarLancheCozinha();
atendente.receberPagamento();
atendente.servindoMesa();

  // Açoes somente o pacote da cozinha precisa conhecer
  //atendente.trocarGas(); Açoes somente o pacote  precisa conhecer,tiro esas visibilidade

  Cliente  cliente = new Cliente();
  cliente.escolherLanche();
  cliente.fazerPedido();
  cliente.pagarConta();

  // Nao deveria mais o estebelecimento nao definiu normas de atendimento
    //cliente.pegarPedidoBalcao();

// Açao Sigilosa que tal ser privada?
//cliente.consultarSaldoAplicativo();

// Ja pensou os clientes ouvindo acabou o gas?
// cozinheiro.pedirParaTrocarGas(atendente);
// cozinheiro.pedirParaTrocarGas(almoxarife);

    }
}
