import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class EtiquetaTests {

    @Test
    void deveRetornarCorRgbCorreta(){
        Etiqueta etiqueta = new Etiqueta();
        etiqueta.setCor("255,255,0");
        assertEquals("255,255,0", etiqueta.getCor());
    }

    @Test
    void corRgbForaDoEscopoDeveRetornarExcecaoCorreta(){
        try{
            Etiqueta etiqueta = new Etiqueta();
            etiqueta.setCor("200,200,200");
            fail();
        } catch (IllegalArgumentException ex) {
            assertEquals("Valor fora do padrao!", ex.getMessage());
        }
    }

    @Test
    void deveRetornarCorRgbCorretaDaHexa(){
        Etiqueta etiqueta = new Etiqueta();
        etiqueta.setCor("#00f000");
        assertEquals("0,255,0", etiqueta.getCor());
    }

    @Test
    void corHexaForaDoEscopoDeveRetornarExcecaoCorreta(){
        try{
            Etiqueta etiqueta = new Etiqueta();
            etiqueta.setCor("#f0980f");
            etiqueta.getCor();
            fail();
        } catch (IllegalArgumentException ex) {
            assertEquals("Cor fora do padrao!", ex.getMessage());
        }
    }
}
