import org.junit.jupiter.api.Test;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

public class EmprestimoTest {
    @Test
    public void testEmprestimoComLivroDisponivel() {
        Date dataRetirada = new Date();
        Date dataDevolucao = new Date();
        Livro livro = new Livro("Java Basics", new Autor("Alan Turing", "Inglês"), "Tecnologia", true);
        Usuario usuario = new Usuario("Gabriel", 21);

        Emprestimo emprestimo = new Emprestimo(livro, usuario, dataRetirada, dataDevolucao);
        assertNotNull(emprestimo);
    }

    @Test
    public void testEmprestimoComLivroIndisponivel() {
        Date dataRetirada = new Date();
        Date dataDevolucao = new Date();
        Livro livro = new Livro("Java Basics", new Autor("Alan Turing", "Inglês"), "Tecnologia", false);
        Usuario usuario = new Usuario("Gabriel", 21);

        assertThrows(IllegalStateException.class, () -> {
            new Emprestimo(livro, usuario, dataRetirada, dataDevolucao);
        });
    }

    @Test
    public void testToString() {
        Date dataRetirada = new Date();
        Date dataDevolucao = new Date();
        Livro livro = new Livro("Java Basics", new Autor("Alan Turing", "Inglês"), "Tecnologia", true);
        Usuario usuario = new Usuario("Gabriel", 21);
        Emprestimo emprestimo = new Emprestimo(livro, usuario, dataRetirada, dataDevolucao);

        String expected = "Livro: Java Basics\n" +
                "Autor: Alan Turing\n" +
                "Genero: Tecnologia\n" +
                "Usuario: Gabriel\n" +
                "Idade: 21\n" +
                "Data de Retirada: " + dataRetirada + "\n" +
                "Data de Devolucao: " + dataDevolucao;

        assertEquals(expected, emprestimo.toString());
    }
}
