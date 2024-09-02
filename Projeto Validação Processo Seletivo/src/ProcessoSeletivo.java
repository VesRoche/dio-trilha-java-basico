import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        // analisarCandidato(1900.0);
        // analisarCandidato(2200.0);
        // analisarCandidato(2000.0);
        //selecaoCandidatos(); //executando o meotodo para mostrar na tela

 String [] candidatos = {"Felipe","Marcia","Julia","Paulo","Augusto"}; // Fazendo ligacoes para os candidatos selecionados
 for(String candidato: candidatos) {
    entrandoEmContato(candidato);

 }
 }
static void entrandoEmContato(String candidato) {
int tentativasRealizadas = 1;
boolean continuarTentando = true;
boolean atendeu = false;
do {
    atendeu = atender();
    continuarTentando = !atendeu;
if(continuarTentando)
tentativasRealizadas++;
else
System.out.println("Contato realizado com sucesso");

}while(continuarTentando && tentativasRealizadas <3);
if(atendeu)
System.out.println("Conseguimos contato com " + candidato +" Na " + tentativasRealizadas + " Tentativa");

else  System.out.println("Não Conseguimos contato com " + candidato +", Número Máximo Tentativas " + tentativasRealizadas + " Realizada");
}
        

//imprimirSelecionados();//Imprimindo os candidatos selecionados
     
   
        //metodo auxiliar atemder
        static  boolean atender() {
        return new Random().nextInt(3) ==1; //valor 1 e 3 for igual a 1;
        }



     
     static void imprimirSelecionados() { //Imprimindo selecionados
        String [] candidatos = {"Felipe","Marcia","Julia","Paulo","Augusto"};

        System.out.println("imprimindo a lista de candidatos informando o índice do elemento");
        for(int indice = 0; indice<candidatos.length;indice++) {
            System.out.println("O candidato de numero " + (indice+1)/*  para selecionar os candidatos somando o indice 0+1*/ + " é " + candidatos[indice]);
        }

        System.out.println("Forma abreviada de interação for each");

        for(String candidato: candidatos) { // Usando foreach 
            System.out.println("O candidato foi selecionado " + candidato);
        }
     }

     static void selecaoCandidatos(){//selecionando os candidatos
        String [] candidatos = {"Felipe","Marcia","Julia","Paulo","Augusto","Monica","Fabricio","Mirela","Daniela","Jorge"};

        int candidatosSelecionados =0;
        int candidatosAtual =0;
        double salarioBase = 2000.0;

        while(candidatosSelecionados <5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            
            System.out.println("O candidato " + candidato + "Solicitou este valor de sálario" + salarioPretendido);
            if(salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + "foi selecionado para a vagas");
                candidatosSelecionados++;   
            }
            candidatosAtual++;
        }

     }

     static  double valorPretendido() {   //valor pretendido
        
        return ThreadLocalRandom.current().nextDouble(1800,2200); //Gerar numero randomico

    }
    static void analisarCandidato(double salarioPretendido) { //verificando salario pretendido do candidato com o salario base interessante!!

         double salarioBase = 2000.0;
         if(salarioBase > salarioPretendido){
         System.out.println("Ligar para o candidato");
     } else if (salarioBase == salarioPretendido) {
         System.out.println("Ligar para o candidato com outra proposta");
     } else {
         System.out.println("Aguardando o resultado dos demais candidatos");
     }
 
 }
 }

