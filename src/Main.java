import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição curso javascript");
        curso2.setCargaHoraria(4);

        /*Conteudo conteudo = new Curso(); //Polimorfismo
        conteudo.calcularXp();
        conteudo.getDescricao();
        conteudo.setDescricao();*/

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria de Java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);

        //Criando o bootcamp
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java Developer");
        bootcamp.setDescricao("Descrição bootcamp java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        //Criando os dev's
        Dev devMarcos = new Dev();
        devMarcos.setNome("Marcos");
        devMarcos.inscreverBootcamp(bootcamp);//Se inscrever no bootcamp
        System.out.println("Conteúdos Inscritos " + devMarcos.getNome() + ": " + devMarcos.getConteudosInscritos());
        devMarcos.progredir();
        devMarcos.progredir(); //Conclui cada curso e mentoria inscrito
        System.out.println("-");
        System.out.println("Conteúdos Inscritos " + devMarcos.getNome() + ": " + devMarcos.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos " + devMarcos.getNome() + ": " + devMarcos.getConteudosConcluidos());
        System.out.println("XP - " + devMarcos.getNome() + ": " + devMarcos.calcularTotalXp());

        System.out.println("");

        Dev devMayara = new Dev();
        devMayara.setNome("Mayara");
        devMayara.inscreverBootcamp(bootcamp); //Se inscrever no bootcamp
        System.out.println("Conteúdos Inscritos " + devMayara.getNome() + ": " + devMayara.getConteudosInscritos());
        devMayara.progredir();
        devMayara.progredir(); //Conclui cada curso e mentoria inscrito
        devMayara.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos " + devMayara.getNome() + ": " + devMayara.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos " + devMayara.getNome() + ": " + devMayara.getConteudosConcluidos());
        System.out.println("XP - " + devMayara.getNome() + ": " + devMayara.calcularTotalXp());


    }

}
