package teste;

import Singleton.ConfiguracaoAplicativo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConfiguracaoAplicativoTest {

    @Test
    public void deveRetornarTemaSistema() {
        ConfiguracaoAplicativo.getInstance().setTemaSistema("Modo Escuro");
        assertEquals("Modo Escuro", ConfiguracaoAplicativo.getInstance().getTemaSistema());
    }

    @Test
    public void deveRetornarIdiomaPadrao() {
        ConfiguracaoAplicativo.getInstance().setIdiomaPadrao("PT-BR");
        assertEquals("PT-BR", ConfiguracaoAplicativo.getInstance().getIdiomaPadrao());
    }

}
