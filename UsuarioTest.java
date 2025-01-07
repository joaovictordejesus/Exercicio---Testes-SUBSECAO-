//João Vicotr de Jesus Augusto
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UsuarioTest {
    @Test
    public void testGetNome() {
        Usuario usuario = new Usuario("Gabriel", 21);
        assertEquals("Gabriel", usuario.getNome());
    }

    @Test
    public void testSetNome() {
        Usuario usuario = new Usuario("Gabriel", 21);
        usuario.setNome("Lucas");
        assertEquals("Lucas", usuario.getNome());
    }

    @Test
    public void testGetIdade() {
        Usuario usuario = new Usuario("Gabriel", 21);
        assertEquals(21, usuario.getIdade());
    }

    @Test
    public void testSetIdade() {
        Usuario usuario = new Usuario("Gabriel", 21);
        usuario.setIdade(25);
        assertEquals(25, usuario.getIdade());
    }
}
