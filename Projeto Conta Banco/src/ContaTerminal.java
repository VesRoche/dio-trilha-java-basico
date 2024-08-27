import java.util.Scanner; //Importando a classe Scanner para salvar os dados

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
      

        Scanner scanner = new Scanner(System.in); //Criando o objeto scanner

        System.out.println("Olá cliente, digite o número da conta. ");
        int Numero = scanner.nextInt(); //Salvando o valor no atributo Numero nextInt

        System.out.println("Olá cliente, digite o número da Agencia. ");
        String Agencia = scanner.next(); //Salvando o valor no atributo Agencia next

        System.out.println("Olá cliente, digite o seu nome completo. ");
        String Nome_Cliente = scanner.next(); //Salvando o valor no atributo Nome_Cliente next

        System.out.println("Olá cliente, digite o número do seu saldo. ");
        double Saldo = scanner.nextDouble(); //Salvando o valor no atributo Saldo nextDouble
        
        scanner.close();
        System.out.println("Olá " + Nome_Cliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+ Agencia +", conta " + Numero + " e seu saldo "+ Saldo +" já está disponível para saque "); 


     
  }

    }

