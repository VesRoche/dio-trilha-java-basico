import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) throws Exception {
        try { //Se estiver tudo ok 
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome");
        String nome = scanner.next();
        
        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura");
        int altura = scanner.nextInt();


        System.out.println("Olá me chamo " + nome.toUpperCase()+" " + sobrenome);
        System.out.println("Tenho" + idade +" anos");
        System.out.println("Minha altura é" + altura + " cm");
        scanner.close();
      
        } catch (InputMismatchException e){// qual exceção eu quero capturar tem que ver no compilador ou seja se der esse erro InputMismatchException, se der esse erro vai aparecer a mensagem
        // System.out.println(" Os campos idade e altura precisam ser numericos");
System.err.println(" Os campos idade e altura precisam ser numericos"); // ou dar um sys out com err que é para apresentar alerta
       }
    }
}
