import java.time.LocalDate;

import dio.guilherme.model.Bootcamp;
import dio.guilherme.model.Conteudo;
import dio.guilherme.model.Curso;
import dio.guilherme.model.Dev;
import dio.guilherme.model.Mentoria;

public class App {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso(); 
        curso1.setTitulo("pROMAGA");
        curso1.setDescricao("Aprender a progamar");
        curso1.setCargaHoraria(200);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de ajva");
        mentoria.setDescricao("uma mentoria");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java Developer");        
        bootcamp.setDescricao("Descrição Bootcamp java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        Dev devGuilherme = new Dev();
        devGuilherme.setNome("Guilherme");
        devGuilherme.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos: " + devGuilherme.getConteudoInscritos());
        devGuilherme.progredir();
        System.out.println("XP: " + devGuilherme.calcularTotalXp());
        System.out.println("Conteudos inscritos: " + devGuilherme.getConteudoInscritos());
        System.out.println("Conteudos Concluidos: " + devGuilherme.getConteudoConcluidos());

        Dev devRichard = new Dev();
        devRichard.setNome("Richard");
        devRichard.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos: " + devRichard.getConteudoInscritos());
        devRichard.progredir();
        devRichard.progredir();

        System.out.println("Conteudos inscritos: " + devRichard.getConteudoInscritos());
        System.out.println("Conteudos Concluidos: " + devRichard.getConteudoConcluidos());
        System.out.println("XP: " + devRichard.calcularTotalXp());

        System.out.println();


    }
}
