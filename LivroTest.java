import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LivroTest {
    @Test
    public void testLivroDisponivel() {
        Autor autor = new Autor("Jess", "Brasileira");
        Livro livro1 = new Livro("Java Basico", autor, "tecnologia", true);
        assertTrue(livro1.isDisponivel());
    }

    @Test
    public void testLivroIndisponivel() {
        Autor autor = new Autor("Jess", "Brasileira");
        Livro livro2 = new Livro("Java Avançado", autor, "tecnologia", false);
        assertFalse(livro2.isDisponivel());
    }

    @Test
    public void testGetTitulo() {
        Autor autor = new Autor("Jess", "Brasileira");
        Livro livro1 = new Livro("Java Basico", autor, "tecnologia", true);
        assertEquals("Java Basico", livro1.getTitulo());
    }

    @Test
    public void testSetTitulo() {
        Autor autor = new Autor("Jess", "Brasileira");
        Livro livro1 = new Livro("Java Basico", autor, "tecnologia", true);
        livro1.setTitulo("Java Intermediario");
        assertEquals("Java Intermediario", livro1.getTitulo());
    }
}
