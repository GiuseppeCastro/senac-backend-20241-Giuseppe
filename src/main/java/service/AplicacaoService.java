package service;


import java.util.List;

import model.entity.Aplicacao;
import model.entity.Pessoa;
import model.entity.Vacina;
import model.repository.AplicacaoRepository;
import model.repository.VacinaRepository;
import model.repository.pessoaRepository;

public class AplicacaoService {

	private AplicacaoRepository aplicacaoRepository;

    public AplicacaoService() {
        this.aplicacaoRepository = new AplicacaoRepository();
    }

    public void salvarAplicacao(Aplicacao aplicacao) {
        aplicacaoRepository.salvarAplicacao(aplicacao);
    }
    
    public void registrarVacinacao(Aplicacao vacinacao) {
        AplicacaoRepository.registrarVacinacao(vacinacao);

        recalcularMediaVacina(vacinacao.getIdVacina());
    }

    public void atualizarVacinacao(Aplicacao vacinacao) {
       AplicacaoRepository.atualizarVacinacao(vacinacao);

        recalcularMediaVacina(vacinacao.getIdVacina());
    }

    private void recalcularMediaVacina(int idVacina) {
        List<Aplicacao> aplicacoes = AplicacaoRepository.consultarAplicacoesPorVacina(idVacina);
        double somaNotas = 0;
        int quantidadeAplicacoes = aplicacoes.size();

        for (Aplicacao aplicacao : aplicacoes) {
            somaNotas += aplicacao.getNota();
        }

        double media = quantidadeAplicacoes > 0 ? somaNotas / quantidadeAplicacoes : 0;

        Vacina vacina = VacinaRepository.consultarVacinaPorId(idVacina);
        vacina.setMediaVacina(media);
        VacinaRepository.atualizarVacina(vacina);
    }
    
    public void registrarVacinacao1(Aplicacao vacinacao) {
        VacinaRepository vacinaRepository = null;
		Vacina vacina = vacinaRepository.consultarVacinaPorId(vacinacao.getIdVacina());
        Pessoa pessoa = pessoaRepository.consultarPessoaPorId(vacinacao.getIdPessoa());
        
        if (!podeReceberVacina(vacina, pessoa)) {
            throw new RuntimeException("A pessoa não pode receber a vacina devido à situação da vacina ou perfil do usuário.");
        }
        AplicacaoRepository.registrarVacinacao(vacinacao);

        recalcularMediaVacina(vacinacao.getIdVacina());
    }

    private boolean podeReceberVacina(Vacina vacina, Pessoa pessoa) {
        int situacaoVacina = vacina.getSituacao(); 
        int perfilUsuario = pessoa.getPerfil();
        
        
        if (perfilUsuario == 1 && situacaoVacina == 1) {
            return true;
        } else if (perfilUsuario <= situacaoVacina) {
            return true; 
        } else {
            return false; 
        }
    }
	
}
