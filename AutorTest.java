//João Victor de Jesus Augusto
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AutorTest {
    @Test
    public void testGetNome() {
        Autor autor = new Autor("Jess", "Brasileira");
        assertEquals("Jess", autor.getNome());
    }

    @Test
    public void testSetNome() {
        Autor autor = new Autor("Jess", "Brasileira");
        autor.setNome("Jessica");
        assertEquals("Jessica", autor.getNome());
    }
}
