import java.util.Scanner;

public class DesafioSalario { //Desafio de calcular Salario
    public static void main(String[] args) throws Exception {

        Scanner entradaDados = new Scanner(System.in);

        System.out.println("Digite o valor do salário");
        double valorSalario = entradaDados.nextDouble();

         System.out.println("Digite o valor do benefício");
          double valorBeneficios = entradaDados.nextDouble();

        entradaDados.close();

        valorSalario =  atribuirSalario(valorSalario); //Preciso fazer isso para o valor do Salario atualizar e enviar para a outra funcao
        imprimirSalario(valorSalario, valorBeneficios);
           
    }

    static double atribuirSalario(double valorSalario) { //tirei o void e coloquei que seu retorno é double
       
    

        if (valorSalario >= 0 && valorSalario <= 1100.0) {
            valorSalario -= 0.05 * valorSalario; // esse -= subtrai da porcentagem do imposto
        } else if (valorSalario > 1100.0 && valorSalario <= 2500.0) {
            valorSalario -= 0.10 * valorSalario;
        }else {
            valorSalario -= 0.15 * valorSalario;
        }
    System.out.println("O valor do salario é " + valorSalario);
    
    return valorSalario; // retorna um valor ajustado
    }
    static void imprimirSalario(double valorSalario, double valorBeneficios) {
        
       double resultadoCalculado = valorSalario +  valorBeneficios;

        System.out.println("O valor do seu salário é " + resultadoCalculado);
} 
}