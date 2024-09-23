package desafio.dominio;

public class Curso extends Conteudo { //Extendendo e nesse caso é obrigatorio coloca metodo CalcularXP como abstrata pois o metodo na classe pai é abstrato

    private int cargaHoraria;


    public Curso() { //construtor vazio

    }

    public double calcularXP() {//implementando calcularXP
        return XP_PADRAO * cargaHoraria; //Quando criar uma mentoria e chamar o metodo calcular, ao concluir um curso vou multiplicar pela carga horaria
    }

    
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    
    @Override
    public String toString() {
        return "Curso [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", cargaHoraria=" + cargaHoraria + "]"; //Acesso esse get dentro da classe curso por isso consigo pegar
    }

  


}
