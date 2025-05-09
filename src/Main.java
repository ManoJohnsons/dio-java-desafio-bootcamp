import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Curso Java", "Curso básico do Java.", 8);
        Curso curso2 = new Curso("Curso JavaScript", "Curso básico do JS.", 4);

        Mentoria mentoria = new Mentoria("Mentoria de Java", "Mentoria para Java.", LocalDate.now());

        Bootcamp bootcampJava = new Bootcamp("Bootcamp Java Developer", "Bootcamp para desenvolvimento Java.");
        bootcampJava.adicionarConteudos(curso1);
        bootcampJava.adicionarConteudos(mentoria);

        Bootcamp bootcampJS = new Bootcamp("Bootcamp JS Developer", "Bootcamp para desenvolvimento JavaScript.");
        bootcampJS.adicionarConteudos(curso2);

        Dev devCamila = new Dev("Camila");
        devCamila.inscreverBootcamp(bootcampJava);
        System.out.printf("Conteúdos Inscritos %s: %s%n", devCamila.getNome(), devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.printf("Conteúdos Inscritos %s: %s%n", devCamila.getNome(), devCamila.getConteudosInscritos());
        System.out.printf("Conteúdos Concluídos %s: %s%n", devCamila.getNome(), devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println("-------");

        Dev devJohn = new Dev("John");
        devJohn.inscreverBootcamp(bootcampJS);
        System.out.printf("Conteúdos Inscritos %s: %s%n", devJohn.getNome(), devJohn.getConteudosInscritos());
        devJohn.progredir();
        System.out.println("-");
        System.out.printf("Conteúdos Inscritos %s: %s%n", devJohn.getNome(), devJohn.getConteudosInscritos());
        System.out.printf("Conteúdos Concluídos %s: %s%n", devJohn.getNome(), devJohn.getConteudosConcluidos());
        System.out.println("XP:" + devJohn.calcularTotalXp());

    }

}
