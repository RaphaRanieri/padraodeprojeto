import org.example.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SuppressWarnings("unused")
public class DetentoTest {

    @Test
    void detentoSemAntecedentesCriminais(){
        Detento detento = new Detento("José Teste", 5);
        detento.setReclusaoStrategy( new ReclusaoSemAntecedente());
        assertEquals("Pena de José Teste: 4.75 anos", detento.calcularReclusao());
    }

    @Test
    void detentoReincidente(){
        Detento detento = new Detento("José Teste", 5);
        detento.setReclusaoStrategy( new ReclusaoReincidente());
        assertEquals("Pena de José Teste: 7.5 anos", detento.calcularReclusao());
    }

    @Test
    void detentoComAgravantes(){
        Detento detento = new Detento("José Teste", 5);
        detento.setReclusaoStrategy( new ReclusaoComAgravante());
        assertEquals("Pena de José Teste: 6.5 anos", detento.calcularReclusao());
    }

    @Test
    void detentoSemEstrategia(){
        Detento detento = new Detento("José Teste", 5);
        assertEquals("Pena de José Teste: 5.0 anos", detento.calcularReclusao());
    }
}
