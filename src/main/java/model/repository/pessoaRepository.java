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
	
	 public void excluirPessoa(int idPessoa) {
	        if (pessoaRepository.pessoaRecebeuDoseVacina(idPessoa)) {
	            throw new RuntimeException("Não é possível excluir a pessoa, pois ela já recebeu pelo menos uma dose de vacina.");
	        }

	        pessoaRepository pessoaRepository = new pessoaRepository();
			pessoaRepository.excluirPessoa(idPessoa);
	    }

	public static boolean pessoaRecebeuDoseVacina(int idPessoa) {
		return false;
	}

	public static Pessoa consultarPessoaPorId(Object idPessoa) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
	
	

