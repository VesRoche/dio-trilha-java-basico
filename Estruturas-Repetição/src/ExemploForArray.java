public class ExemploForArray {
    public static void main(String[] args) {
        
        // String alunos  [] = { "Felipe", "Jonas", "Julia" ,"Marcos"};

        // for(int x= 0; x<alunos.length; x++) { //For com array enquanto x for menor que o tamanho de alunos length é alunos

        //     System.out.println("O aluno no indice x = " +x+ " é " + alunos[x]); // Imprimir  nome dos alunos pelos indices 
        //}

        String alunos  [] = { "Felipe", "Jonas", "Julia" ,"Marcos"};

        for(String aluno: alunos) { //Usando foreach 
            System.out.println("Nome do aluno é " + aluno);
        }
    }


}
