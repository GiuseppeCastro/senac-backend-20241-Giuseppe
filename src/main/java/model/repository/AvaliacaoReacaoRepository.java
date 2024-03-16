package model.repository;

import java.util.ArrayList;
import java.util.List;
import model.entity.AvaliacaoReacao;

public class AvaliacaoReacaoRepository {

	private List<AvaliacaoReacao> avaliacoes;

    public AvaliacaoReacaoRepository() {
        this.avaliacoes = new ArrayList<>();
    }

    // Método para salvar uma nova avaliação de reação à vacina
    public void salvarAvaliacao(AvaliacaoReacao avaliacao) {
        avaliacoes.add(avaliacao);
    }

    // Método para listar todas as avaliações cadastradas
    public List<AvaliacaoReacao> listarAvaliacoes() {
        return avaliacoes;
    }

	
}
