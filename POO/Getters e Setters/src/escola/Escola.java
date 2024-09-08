package escola;

public class Escola {
    public static void main(String[] args) {
        Aluno felipe = new Aluno(); //criando objeto

        felipe.setNome("Felipe"); //valores dos atributos desse objeto
        felipe.setIdade(8);
        felipe.setSexo("Masculino");

        System.out.println(" O aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos" + " É do sexo "+ felipe.getSexo()); //Usando get
    }
}
