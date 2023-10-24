import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class VerificarClasseNoDiretorioTests {

    @Test
    public void TestVerificacaoExisteNaoParalela() {
        String[] args = new String[] { "classes", "TestClass" };

        assertTrue(VerificarClasseNoDiretorio.verificar(args));
    }

    @Test
    public void TestVerificacaoExisteParalela() {
        String[] args = new String[] { "classes", "TestClass", "-p" };

        assertTrue(VerificarClasseNoDiretorio.verificar(args));
    }

    @Test
    public void TestVerificacaoNaoExiste() {
        String[] args = new String[] { "classes", "Abc" };

        assertFalse(VerificarClasseNoDiretorio.verificar(args));
    }
}
