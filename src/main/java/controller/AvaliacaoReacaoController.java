package controller;

import service.avaliacaoReacaoService;
import model.entity.AvaliacaoReacao;
import java.util.List;

public class AvaliacaoReacaoController {

    private final avaliacaoReacaoService avaliacaoReacaoService;

    public AvaliacaoReacaoController(avaliacaoReacaoService avaliacaoReacaoService) {
        this.avaliacaoReacaoService = avaliacaoReacaoService;
    }

    public void salvarAvaliacao(AvaliacaoReacao avaliacao) {
        avaliacaoReacaoService.salvarAvaliacao(avaliacao);
        System.out.println("Avaliação salva com sucesso!");
    }

    public List<AvaliacaoReacao> listarTodasAvaliacoes() {
        List<AvaliacaoReacao> avaliacoes = avaliacaoReacaoService.listarAvaliacoes();
        if (avaliacoes.isEmpty()) {
            System.out.println("Não há avaliações cadastradas.");
        } else {
            for (AvaliacaoReacao avaliacao : avaliacoes) {
                System.out.println(avaliacao);
            }
        }
        return avaliacoes;
    }

}
