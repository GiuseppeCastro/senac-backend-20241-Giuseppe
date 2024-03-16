package model.repository;

import java.util.ArrayList;
import java.util.List;

import model.entity.Pessoa;

public class pessoaRepository {

	private List<Pessoa> pessoas;
	
	public pessoaRepository() {
		this.pessoas = new ArrayList<>();
	}
	
	public void SalvarPessoa(Pessoa pessoa) {
		pessoas.add(pessoa);
	}
	
	public List<Pessoa> listarPessoas(){
		return pessoas;
	}
	
	public void excluirPessoa(Pessoa pessoa) {
		pessoas.remove(pessoa);
	}
	
	
}
