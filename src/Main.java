import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição Curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devPam = new Dev();
        devPam.setNome("Pam");
        devPam.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Pam" + devPam.getConteudosInscritos());
        devPam.progredir();
        devPam.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Pam" + devPam.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Pam" + devPam.getConteudosConcluidos());
        System.out.println("XP:" + devPam.calcularTotalXp());

        System.out.println("------");

        Dev devJim = new Dev();
        devJim.setNome("Jim");
        devJim.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Jim" + devJim.getConteudosInscritos());
        devJim.progredir();
        devJim.progredir();
        devJim.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Jim" + devJim.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Jim" + devJim.getConteudosConcluidos());
        System.out.println("XP:" + devJim.calcularTotalXp());

    }
}
