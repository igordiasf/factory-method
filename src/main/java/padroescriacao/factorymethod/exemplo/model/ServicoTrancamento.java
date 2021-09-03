package padroescriacao.factorymethod.exemplo.model;

public class ServicoTrancamento implements IServico {

    public String executar() {
        return "Trancamento efetivado";
    }

    public String cancelar() {
        return "Trancamento cancelado";
    }
}
