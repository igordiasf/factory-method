package padroescriacao.factorymethod.exemplo.factory;

import org.junit.jupiter.api.Test;
import padroescriacao.factorymethod.exemplo.model.IServico;

import static org.junit.jupiter.api.Assertions.*;

class ServicoFactoryTest {

    @Test
    void deveRetornarExcecaoParaServicoInexistente() {
        try {
            IServico servico = ServicoFactory.obterServico("Pendurar pagamento");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Serviço inexistente", e.getMessage());
        }
    }
}