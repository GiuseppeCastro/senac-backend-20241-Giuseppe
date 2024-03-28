package model.repository;

import java.util.ArrayList;
import java.util.List;
import model.entity.Aplicacao;

public class AplicacaoRepository {

	private List<Aplicacao> aplicacoes;

    public AplicacaoRepository() {
        this.aplicacoes = new ArrayList<>();
    }

    // Método para salvar uma nova aplicação de vacina
    public void salvarAplicacao(Aplicacao aplicacao) {
        aplicacoes.add(aplicacao);
    }

    // Método para listar todas as aplicações cadastradas
    public List<Aplicacao> listarAplicacoes() {
        return aplicacoes;
    }

    // Método para excluir uma aplicação
    public void excluirAplicacao(Aplicacao aplicacao) {
        aplicacoes.remove(aplicacao);
    }

	public static void registrarVacinacao(Aplicacao vacinacao) {
		// TODO Auto-generated method stub
		
	}

	public static List<Aplicacao> consultarAplicacoesPorVacina(int idVacina) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void atualizarVacinacao(Aplicacao vacinacao) {
		// TODO Auto-generated method stub
		
	}
	
}
