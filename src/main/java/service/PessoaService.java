package service;

import model.entity.Pessoa;
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
	
}
