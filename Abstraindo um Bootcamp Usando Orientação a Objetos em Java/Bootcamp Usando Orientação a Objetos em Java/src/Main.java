import java.time.LocalDate;


import desafio.dominio.*; //Importa todas as classes

public class Main {
    public static void main(String[] args) {

    Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java"); //Definindo pelo Set
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);
        System.out.println(curso1);
        

    Curso curso2 = new Curso();
            
        
        curso2.setTitulo("Curso Js"); //Definindo pelo Set
        curso2.setDescricao("Descrição Curso Js");
        curso2.setCargaHoraria(4);


        System.out.println(curso2);

        // Conteudo conteudo = new Conteudo();//Nao consigo instanciar pois é uma classe abstrata
   
        Conteudo conteudo = new Curso(); // Mas posso instanciar assim posso criar um Curso a partir da minha classe Conteudo, isso é polimorfismo, tudo que tem em Conteudo eu tenho em Curso, mas nem tudo que eu tenho em curso eu tenho em Conteudo

        Conteudo conteudo1 = new Mentoria(); // Ou posso fazer assim que Conteudo é mae de Curso e Mentoria


        
        Mentoria  mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descricao Mentoria Java");
        mentoria.setData(LocalDate.now()); //Data


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila  = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("Conteudos Inscritos" + devCamila.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Camila" + devCamila.getConteudosConcluidos());
        System.out.println("XP" + devCamila.calcularTotalXp());
        

        Dev devJoao  = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("Conteudos Inscritos" + devJoao.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Jao" + devJoao.getConteudosConcluidos());
        System.out.println("XP" + devJoao.calcularTotalXp());


        
    }
}
