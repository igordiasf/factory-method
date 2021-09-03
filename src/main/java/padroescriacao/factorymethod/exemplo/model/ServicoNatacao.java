package padroescriacao.factorymethod.exemplo.model;

public class ServicoNatacao implements IServico {

    public String executar() {
        return "Natação efetivada";
    }

    public String cancelar() {
        return "Natação cancelada";
    }
}
