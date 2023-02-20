import java.time.LocalDate;

import dio.guilherme.model.Curso;
import dio.guilherme.model.Mentoria;

public class App {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso(); 
        curso1.setNome("pROMAGA");
        curso1.setDescricao("Aprender a progamar");
        curso1.setCargaHoraria(200);

        System.out.println(curso1);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de ajva");
        mentoria.setDescricao("uma mentoria");
        mentoria.setData(LocalDate.now());

        System.out.println(mentoria);
    }
}
