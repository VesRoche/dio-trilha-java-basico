package lanchonete.atendimento.cozinha;


public class Cozinheiro {
    public void adicionarLancheNoBalcao() {
        System.out.println("Adicionando Lanche Natural Hamburger no Balcão");
    }

    public void adicionarSucoNoBalcao() {
        System.out.println("Adicionando Suco no Balcão");
    }

    public void adicionarComboNoBalcao() {
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }

    private void prepararLanche() {
        System.out.println("Preparando Lanche Tipo Hamburger");
    }

    private void prepararVitamina() {
        System.out.println("Preparando Suco");
    }

    private void prepararCombo() { // private nao deixa visivel nem para o msm pacote 
       prepararLanche();
       prepararVitamina();
    }

    public void selecionarIngredientesLanche() {
        System.out.println("Selecionado o pão, salada, ovo e carne");
    }

    private void selecionarIngredientesVitamina() {
        System.out.println("Selecionado Fruta, Leite e Suco");
    }

    private void lavarIngredientes() {
        System.out.println("Lavando Ingredientes");
    }

    private void baterVitaminaLiquidificador() {
        System.out.println("Batendo a Vitamina no Liquidificador");
    }

    public void fritarIngredientesLanche() {
        System.out.println("Fritando a carne e ovo para o Hamburger");
    }

    // public void pedirParaTrocarGas(Atendente meuAmigo) {// // Açoes somente o pacote  precisa conhecer,tiro esas visibilidade
    //     meuAmigo.trocarGas();
    // }

    private void pedirParaTrocarGas(Almoxarife meuAmigo) {
        meuAmigo.trocarGas();
    }

    private void pedirIngredientes(Almoxarife almoxarife) {
        almoxarife.entregarIngredientes(); // consegue acessar e pedir para entregar ingredientes
    }
}
