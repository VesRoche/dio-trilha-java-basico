package desafio.dominio;

public abstract class Conteudo {
    
    protected static final double XP_PADRAO = 10d; // //constante sendo controlado pela propria classe vou criar uma constante tem que ser static pois ela deve ter realcao com a classe //Exemplo.meuMetodoEstatico(); esse Exemplo é o nome da classe, nao precisaria instanciar um objeto e depois chamar um metodo com uma  instancia da classe

    private String titulo;
    private String descricao;

    public abstract double calcularXP(); // Vou colocar abstrato aqui, nota-se que se aqui eu coloco abstrado a classe Conteudo obrigatoriamente tem que ser abstrata tambem, quando uso uma classe abstrata nao consigo instanciar ela isso é importante

    public static double getXpPadrao() {
        return XP_PADRAO;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    
}
