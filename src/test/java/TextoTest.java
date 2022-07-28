import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TextoTest {

    @Test
    public void deveAdicionarTexto(){
        Texto texto = new Texto();
        texto.escreverTexto("Primeira linha do texto\n");
        texto.escreverTexto("Segunda linha do texto\n");
        texto.escreverTexto("Terceira linha do texto");
        assertEquals("Primeira linha do texto\n" +
                             "Segunda linha do texto\n" +
                             "Terceira linha do texto", texto.mostrarTexto());
    }

    @Test
    public void deveExcluirTexto(){
        Texto texto = new Texto();
        texto.escreverTexto("Primeira linha do texto\n");
        texto.escreverTexto("Segunda linha do texto\n");
        texto.escreverTexto("Terceira linha do texto");
        texto.desfazerEscrita();
        assertEquals("Primeira linha do texto\n" +
                "Segunda linha do texto\n", texto.mostrarTexto());
    }

}