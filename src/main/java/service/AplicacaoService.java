package service;


import model.entity.Aplicacao;
import model.repository.AplicacaoRepository;

public class AplicacaoService {

	private AplicacaoRepository aplicacaoRepository;

    public AplicacaoService() {
        this.aplicacaoRepository = new AplicacaoRepository();
    }

    // Método para salvar uma nova aplicação de vacina
    public void salvarAplicacao(Aplicacao aplicacao) {
        aplicacaoRepository.salvarAplicacao(aplicacao);
    }
	
}
