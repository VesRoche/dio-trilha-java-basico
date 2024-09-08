public class SistemaCadastro {
    public static void main(String[] args) {
        //Pessoa marcos = new Pessoa(); // Deu erro por causa do construtor
        Pessoa marcos = new Pessoa("123","Marcos"); // Agora tenho que passar os parametros aqui ja que tenho o construtor

        marcos.setEndereco("Rua das Marias");

        System.out.println(marcos.getNome()+ "-" + marcos.getCpf());
    }

}
