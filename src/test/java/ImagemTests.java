import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class ImagemTests {

    @Test
    void deveRetornarCorRgbCorreta(){
        Imagem imagem = new Imagem();
        imagem.setCor("255,255,0");
        assertEquals("255,255,0", imagem.getCor());
    }

    @Test
    void corRgbForaDoEscopoDeveRetornarExcecaoCorreta(){
        try{
            Imagem imagem = new Imagem();
            imagem.setCor("200,200,200");
            fail();
        } catch (IllegalArgumentException ex) {
            assertEquals("Valor fora do padrao!", ex.getMessage());
        }
    }

    @Test
    void deveRetornarCorRgbCorretaDaHexa(){
        Imagem imagem = new Imagem();
        imagem.setCor("#00f000");
        assertEquals("0,255,0", imagem.getCor());
    }

    @Test
    void corHexaForaDoEscopoDeveRetornarExcecaoCorreta(){
        try{
            Imagem imagem = new Imagem();
            imagem.setCor("#f0980f");
            imagem.getCor();
            fail();
        } catch (IllegalArgumentException ex) {
            assertEquals("Cor fora do padrao!", ex.getMessage());
        }
    }
}
