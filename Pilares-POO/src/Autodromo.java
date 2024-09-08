public class Autodromo {
    public static void main(String[] args) throws Exception {
        Carro jeep = new Carro();
        jeep.setChassi("897897");
       // jeep.ligar();


        Moto z400 = new Moto(); //criando objeto
        z400.setChassi("404769");
        //z400.ligar();


        Veiculo coringa = jeep;  // Polimorfismo nota-se que tenho a classe mais generica, e eu informo ela como coringa, mas ela nao sabe o comportamento, o comportamento vai ser mediante ao polimorfismo de cada uma classe que estender, nesse caso ela ta executando ligar por causa do = objeto
        coringa.ligar();
    }

  


}
