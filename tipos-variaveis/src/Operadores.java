public class Operadores {
    public static void main(String[] args) { // esse void sginifica que nao sera retornado nenhum resultado
        // final double salarioMinimo =2500; //final é uma constante que nunca muda

        // String concatenacao = "?";

        // concatenacao = 1+1+1 +"1"; //= 31 Soma os inteiros e adiciona 1 no final pois
        // é string

        // System.out.println(concatenacao);

        // concatenacao = 1+"1"+1+1; //= 1111 ficou texto

        // System.out.println(concatenacao);

        // concatenacao = "1"+1+1+1; //= 1111 ficou texto

        // System.out.println(concatenacao);

        // concatenacao = "1"+(1+1+1); //= 13 primeiro ele realizou a soma dos
        // parenteses e ele realizou a concatenacao depois

        // System.out.println(concatenacao);

        // int numero =5;

        // numero = -numero; //numero é igual a ele mesmo de forma negativa ou seja
        // deixa ele negativo.

        // System.out.println(numero);

        // numero = + numero; //nao ficou positivo pois o sinal de mais é um operador de
        // soma para converter preciso realizar uma multiplicação
        // numero = + numero * -1; //agora converti e deixei ele positivo
        // System.out.println(numero);

        // int numero =5;
        // //x repeticao
        // numero ++; //incrementar

        // System.out.println(numero);

        // int a;
        // int b;

        // a = 5;
        // b= 6;

        // // String resultado = ""; // resultado é igual a sem valor ou seja nao tem
        // valor

        // String resultado = a==b ? "verdadeiro" : "falso"; // Isso é um if ternario

        // System.out.println(resultado);

        // int numero1 =1;
        // int numero2 =2;

        // boolean simNao = numero1 == numero2; //Verifica se é igual

        // System.out.println("numeroUm é igual a numeroDois? " + simNao);

        // simNao = numero1 != numero2; //diferente

        // System.out.println("numeroUm é diferente a numeroDois? " + simNao);

        // simNao = numero1 > numero2; //maior

        // System.out.println("numeroUm é maior que numeroDois? " + simNao);

        // simNao = numero1 < numero2; //menor

        // System.out.println("numeroUm é menor que numeroDois? " + simNao);

        // String nomeUm ="Gleyson";
        // String nomeDois = new String("Gleyson"); //criando um objeto

        // System.out.println(nomeUm.equals(nomeDois)); //esse equals compara conteudos
        // agora a alternativa fica true

        boolean condicao1 = true;

        boolean condicao2 = false;

        if (condicao1 && condicao2)
            
        {// verificando se as condiçoes forem verdadeira
            System.out.println("As duas condições são verdadeiras");
        }
        if (condicao1 || condicao2)
            
        {// verificando se  condicao1 ou condicao2 for verdadeira
            System.out.println("Uma das condições são verdadeiras");
        }
        System.out.println("Fim");
    }
}
