package desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{ //Extende conteudo como criei o metodo calcularXP como abstrato tenho que implementar ele aqui tambem
  
    private LocalDate data; // Classe para Data

    
    @Override

    public double calcularXP() {//implementando calcularXP //Lembrando que eu tenho que instanciar o metodo abstrato aqui que é o calcular Xp
        return XP_PADRAO + 20d; //Quando criar uma mentoria e chamar o metodo calcular XP o Xp referente a Mentoria vai ser mais 20
    }

    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
   
    @Override
    public String toString() {
        return "Mentoria [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", data=" + data + "]"; //acessando por get
    }
   

    

    
}
