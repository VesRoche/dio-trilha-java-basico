public class ExemploBreakContinue {
    public static void main(String[] args) {
        
        for (int numero =1; numero <=5; numero++) {
            if(numero ==3)
             break; // interroupeu o antes de parar no 3 e para aplicação
            // continue; // pula o numero 3 e imprime o restante nao para a aplicação
            

            System.out.println(numero);
        }
    }
}
