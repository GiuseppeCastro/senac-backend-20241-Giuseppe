package service;

import model.entity.Pessoa;
import model.repository.AplicacaoRepository;
import model.repository.pessoaRepository;

public class PessoaService {

	private pessoaRepository pessoaRepository;
	
	public PessoaService() {
		this.pessoaRepository = new pessoaRepository();
	}
	
	public void salvarPessoa(Pessoa pessoa) throws ControleVacinasException {
		if (pessoa.getNome() == null || pessoa.getDataNascimento() == null || pessoa.getCPF() == null) {
			throw new ControleVacinasException("Todos os campos são obrigatorios.");
		}
		
		pessoaRepository.SalvarPessoa(pessoa);

	}
	
	 public void excluirPessoa(int idPessoa) {
	        // Verificar se a pessoa já recebeu pelo menos uma dose de vacina
	        if (pessoaRepository.pessoaRecebeuDoseVacina(idPessoa)) {
	            throw new RuntimeException("Não é possível excluir a pessoa, pois ela já recebeu pelo menos uma dose de vacina.");
	        }

	        // Caso a pessoa não tenha recebido nenhuma dose de vacina, pode ser excluída
	        pessoaRepository.excluirPessoa(idPessoa);
	    }
	
}
