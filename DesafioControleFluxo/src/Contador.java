import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {

        

       Scanner terminal = new Scanner(System.in);

       System.out.println("Digite o primeiro parâmetro");
       int parametroUm = terminal.nextInt();
       System.out.println("Digite o segundo parâmetro");
       int parametroDois = terminal.nextInt();

    try {
       contar(parametroUm, parametroDois);

    }catch (ParametrosInvalidosException e ){ //Chamando a classe do meu arquivo 
        System.err.println("imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro");
}
       terminal.close();
      
    }   static void contar(int  parametroUm, int parametroDois)throws ParametrosInvalidosException{// ve throws é usada na assinatura de um método para indicar que o método pode lançar uma ou mais exceções durante a sua execução. Isso é importante para lidar com erros e situações excepcionais que podem ocorrer durante a execução do código.

        if(parametroUm > parametroDois) {
            throw new ParametrosInvalidosException(); //throw vou lançar uma execao e com ParametrosInvalidosException vou criar Cria uma nova instância da classe ParametrosInvalidosException
        }else{
        int contagem = parametroDois - parametroUm;
        
        for( int i = 0; i <=contagem;  i++) {

            System.out.println("Imprimindo os números " + i);

        }
    }

    }


}
