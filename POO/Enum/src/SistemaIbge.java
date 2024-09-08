public class SistemaIbge {
    public static void main(String[] args) {
        for(EstadoBrasileiro e: EstadoBrasileiro.values()){//percorrendo o Enum para percorrer preciso colocar  EstadoBrasileiro.values()
            System.out.println(e.getSigla() + " - "+ e.getNome()); // Acessando os valores 

        } 

        EstadoBrasileiro eb = EstadoBrasileiro.CEARA; //acessando Individualmente

        System.out.println(eb.getNome());
        System.out.println(eb.getSigla());
        System.out.println(eb.getNomeMaiusculo());
        System.out.println(eb.getIbge());
    }
}
