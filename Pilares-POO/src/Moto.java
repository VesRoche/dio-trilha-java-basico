public class Moto extends Veiculo{// Herança extends Veiculo que é uma classe genérica, ou seja notasse que eu nao tenho o chassi da moto nem do carro na Classe Moto e Carro, porem com extends Veiculo eu consigo ter agora, ou seja o chassi que esta na classe veiculo pode ser usado na classe de Carro e moto 
    // private String chassi;

    public void ligar() {

        System.out.println("MOTO LIGADA");
    } 

    
    // public String getChassi() {
    //     return chassi;
    // }

    // public void setChassi (String chassi) {
    //     this.chassi = chassi;
  //  }    
}
