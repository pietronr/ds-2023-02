package tests;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import classes.Endereço;

public class EndereçoTests {
    
    @Test
    public void testBuilderPatternWithoutNullProps() {
        Endereço endereco1 = new Endereço.Builder("Rua 1", "Setor A", "12345-678", "10")
            .cidade("Cidade X")
            .estado("Estado Y")
            .bloco("Bloco Z")
            .quadra("Quadra W")
            .build();

        assertNotNull(endereco1);
        assertEquals("Rua 1", endereco1.getRua());
        assertEquals("Setor A", endereco1.getSetor());
        assertEquals("12345-678", endereco1.getCep());
        assertEquals("10", endereco1.getNumero());
        assertEquals("Cidade X", endereco1.getCidade());
        assertEquals("Estado Y", endereco1.getEstado());
        assertEquals("Bloco Z", endereco1.getBloco());
        assertEquals("Quadra W", endereco1.getQuadra());
    }

    @Test
    public void testBuilderPatternWithNullFields() {
        Endereço endereco2 = new Endereço.Builder("Rua 2", "Setor B", "54321-876", "20")
            .build();

        assertNotNull(endereco2);
        assertEquals("Rua 2", endereco2.getRua());
        assertEquals("Setor B", endereco2.getSetor());
        assertEquals("54321-876", endereco2.getCep());
        assertEquals("20", endereco2.getNumero());
        
        assertNull(endereco2.getCidade());
        assertNull(endereco2.getEstado());
        assertNull(endereco2.getBloco());
        assertNull(endereco2.getQuadra());
    }
}
