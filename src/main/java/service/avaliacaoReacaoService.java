package service;

import java.util.List;

import model.entity.AvaliacaoReacao;
import model.repository.AvaliacaoReacaoRepository;

public class avaliacaoReacaoService {

	private AvaliacaoReacaoRepository avaliacaoReacaoRepository;

    public void AvaliacaoReacaoService() {
        this.avaliacaoReacaoRepository = new AvaliacaoReacaoRepository();
    }

    // Método para salvar uma nova avaliação de reação à vacina
    public void salvarAvaliacao(AvaliacaoReacao avaliacaoReacao) {
        avaliacaoReacaoRepository.salvarAvaliacao(avaliacaoReacao);
    }
    
    public List<AvaliacaoReacao> listarAvaliacoes() {
        return avaliacaoReacaoRepository.listarAvaliacoes();
    }
	
}
