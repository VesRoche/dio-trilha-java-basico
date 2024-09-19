public abstract class Conta  implements IConta{ //implementando interface conta //Deixo essa classe abstrata pois nao quero que ninguem instancie ela nao faz sentido eu dar um new so em conta sem falar se ela é corrente ou poupança é corrente ou poupança a classe abstrata garante que ninguem vai dar um new nela  a nao ser seus filhos, como é uma classe abstrata o Interface nao funciona nela e nao obriga ela a fazer nada
    
    private static final int AGENCIA_PADRAO = 1; //constante sendo controlado pela propria classe vou criar uma constante tem que ser static pois ela deve ter realcao com a classe
    private static  int SEQUENCIAL = 1; //Constante sendo controlado pela propria classe vou criar uma constante tem que ser static pois ela deve ter realcao com a classe Conta  e nao com a instancia ex  (ou static method) é um método que pertence à classe em vez de a instâncias individuais da classe. Isso significa que você pode chamar um método estático sem precisar criar um objeto da classe, ex  // Chamando o método estático
    //Exemplo.meuMetodoEstatico(); esse Exemplo é o nome da classe, nao precisaria instanciar um objeto e depois chamar um metodo com uma  instancia da classe

    protected int agencia; //Protected os filhos conseguem ver, private so o pai consegue ou a propria classe, default consegue acessar somente no mesmo pacote, public fica visivel para todos
    protected int numero;
    protected double saldo;


    public Conta() {
        this.agencia = Conta.AGENCIA_PADRAO; //acessando constante estatica
        this.numero = SEQUENCIAL++;
        
    }

    @Override
    public void sacar(double valor) {
      this.saldo = saldo -valor;  // subtrai o valor, posso usar o this ou nao
    }

    @Override
    public void depositar(double valor) {
        this.saldo = saldo +valor; //soma o saldo mais o valor, posso usar o this ou nao
    }

    @Override
    public void transferir(double valor, Conta contaDestino) { //Esse conta preciso para informar qual conta estou passando se é corrente ou poupança
      //a transferencia é nada mais que as duas operacoes que nois ja fez

        this.sacar(valor); //sacando da conta
        contaDestino.depositar(valor); // depositando aconta

    }


    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void imprimirInfosComuns() {
      
        System.out.println(String.format(" Agencia: %d ", this.agencia)); //Formatando
        System.out.println(String.format(" Número: %d ", this.numero)); //Formatando
        System.out.println(String.format(" Saldo: %.2f ", this.saldo)); //Formatando com duas casas decimais
        
       
       }

 

}


