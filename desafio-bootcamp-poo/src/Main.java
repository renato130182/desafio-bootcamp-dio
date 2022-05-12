import com.br.desafio.dominio.Curso;
import com.br.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso basico de Java");
        curso1.setCargaHoraria(20);
        System.out.println(curso1.toString());
        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Java class");
        mentoria1.setDescricao("Mentoria basica de Java");
        mentoria1.setData(LocalDate.now());
        System.out.println(mentoria1.toString());

    }
}