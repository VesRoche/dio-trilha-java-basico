public  class Carro  extends Veiculo{ //Herança extends Veiculo que é uma classe genérica, ou seja notasse que eu nao tenho o chassi da moto nem do carro na Classe Moto e Carro, porem com extends Veiculo eu consigo ter agora, ou seja o chassi que esta na classe veiculo pode ser usado na classe de Carro e moto 
    // private String chassi;


    // public String getChassi() {
    //     return chassi;
    // }

    // public void setChassi (String chassi) {
    //     this.chassi = chassi;
    // }

    public void ligar() { 
        System.out.println("Carro Ligado");
        confereCambio(); // Preciso chamar aqui para executar pois o metodo é privado
        confereCombustivel();// Preciso chamar aqui para executar  pois o metodo é privado
    }
    private void confereCombustivel() { //encapsular é esconder ações que serao executadas somente dentro da propria classe
        System.out.println("Conferindo combustível");
    }
    private void confereCambio() {//encapsular é esconder ações que serao executadas somente dentro da propria classe
        System.out.println("Conferindo cambio em P");
    }
}
