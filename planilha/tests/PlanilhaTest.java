package tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import classes.Célula;
import classes.Planilha;

public class PlanilhaTest {
    @Test
    public void testAdicionarNomePlanilha() {
        Planilha planilha = new Planilha();

        planilha.setNome("Teste");

        assertEquals("Teste", planilha.getNome());
    }

    @Test
    public void testAdicionarCelulasPlanilha() {
        Planilha planilha = new Planilha();

        List<Célula> células = new ArrayList<>();

        Célula celulaA = new Célula("A", "Valor 1", planilha);
        Célula celulaB = new Célula("B", "Valor 2", planilha);

        células.add(celulaA);
        células.add(celulaB);

        planilha.setCelulas(células);

        assertNotNull(celulaA);
        assertNotNull(celulaB);
        assertEquals(2, planilha.getCelulas().size());
    }

    @Test
    public void testNomeConteudoCelulas() {
        Planilha planilha = new Planilha();

        Célula celulaA = new Célula("A", "Valor 1", planilha);
        Célula celulaB = new Célula("B", "Valor 2", planilha);

        assertEquals("A", celulaA.getNome());
        assertEquals("B", celulaB.getNome());
        assertEquals("Valor 1", celulaA.getConteudo());
        assertEquals("Valor 2", celulaB.getConteudo());
    }

    @Test
    public void testObserverPattern() {
        Planilha planilha = new Planilha();

        Célula celulaA = new Célula("A", "Valor 1", planilha);
        Célula celulaB = new Célula("B", "Valor 2", planilha);
        Célula celulaC = new Célula("C", "Valor 3", planilha);

        celulaA.setConteudo("Novo valor para A");

        String expectedMessageB = "Reavaliar célula B por mudança ocorrida na célula A, que agora possui valor "
                + celulaA.getConteudo();
        String expectedMessageC = "Reavaliar célula C por mudança ocorrida na célula A, que agora possui valor "
                + celulaA.getConteudo();

        assertEquals(expectedMessageB, celulaB.getAviso());
        assertEquals(expectedMessageC, celulaC.getAviso());
    }
}
