

public class Pessoa {

    private String nome;
    private String cpf;
    private String endereco; 

    public Pessoa (String cpf, String nome) { // Metodo construtor, ele tem que ser igual ao nome da classe, tambem é parecido com metodo setters
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }



}
