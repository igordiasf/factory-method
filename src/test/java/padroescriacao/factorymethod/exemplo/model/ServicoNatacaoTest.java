package padroescriacao.factorymethod.exemplo.model;

import org.junit.jupiter.api.Test;
import padroescriacao.factorymethod.exemplo.factory.ServicoFactory;

import static org.junit.jupiter.api.Assertions.*;

class ServicoNatacaoTest {

    @Test
    void deveExecutarNatacao () {
        IServico servico = ServicoFactory.obterServico("Natação ");
        assertEquals("Natação  efetivada", servico.executar());
    }

    @Test
    void deveCancelarNatacao () {
        IServico servico = ServicoFactory.obterServico("Natação ");
        assertEquals("Natação  cancelada", servico.cancelar());
    }

}