public interface IConta { //obriga os outros a ter o mesmo metodo
    
public void sacar(double valor);

public void depositar(double valor);

public void transferir(double valor, Conta contaDestino); //ja estou usando polimorfismo usando uma classe Conta aqui to esperando uma conta corrente ou poupança aqui polimorfismo é a capacidade de um objeto ser referenciado de varias formas //Esse conta preciso para informar qual conta estou passando se é corrente ou poupança




public void imprimirExtrato();

}
