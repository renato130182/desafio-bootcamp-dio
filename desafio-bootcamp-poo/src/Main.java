import com.br.desafio.dominio.Bootcamp;
import com.br.desafio.dominio.Curso;
import com.br.desafio.dominio.Dev;
import com.br.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso basico de Java");
        curso1.setCargaHoraria(20);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Java 2");
        curso2.setDescricao("Curso basico de Java2");
        curso2.setCargaHoraria(40);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Java class");
        mentoria1.setDescricao("Mentoria basica de Java");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java Developer");
        bootcamp.setDescricao("Java developer bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev dev1 = new Dev();
        dev1.setNome("Renato");
        Dev dev2 = new Dev();
        dev2.setNome("Vitor");
        Dev dev3 = new Dev();
        dev3.setNome("Joana");
        Dev dev4 = new Dev();
        dev4.setNome("Dayana");

        dev1.inscrever(bootcamp);
        showInfo(dev1);
        dev1.progredir();
        showInfo(dev1);

        dev2.inscrever(bootcamp);
        showInfo(dev2);
        dev2.progredir();
        dev2.progredir();
        showInfo(dev2);

        dev3.inscrever(bootcamp);
        showInfo(dev3);
        dev3.progredir();
        dev3.progredir();
        showInfo(dev3);

        dev4.inscrever(bootcamp);
        showInfo(dev4);
        dev4.progredir();
        dev4.progredir();
        dev4.progredir();
        showInfo(dev4);
    }
    public static void showInfo(Dev dev){
        System.out.println(dev.getNome() + " inscrito em: " + dev.getConteudoInscrito());
        System.out.println(dev.getNome() + "Concluidos: " + dev.getConteudoConcluido());
        System.out.println(dev.getNome() + " XP: " + dev.calcularTotalXp());
        System.out.println(" ");
    }
}