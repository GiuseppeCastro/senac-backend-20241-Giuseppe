package controller;

import model.entity.Pessoa;
import model.repository.pessoaRepository;
import service.ControleVacinasException;
import service.PessoaService;

import java.util.List;

public class PessoaController {

	private PessoaService pessoaService;
	private pessoaRepository pessoarepository;
	
	public PessoaController() {
		this.pessoaService = new PessoaService();
		this.pessoarepository = new pessoaRepository();
	}
	
	public void salvarPessoa(Pessoa pessoa) {
		try {
			pessoaService.salvarPessoa(pessoa);
			System.out.println("Pessoa Salva com sucesso!");
		} catch (ControleVacinasException e) {
			System.out.println("Erro ao salvar pessoa: " + e.getMessage());
		}
	}
	
	public List<Pessoa> listarPessoas() {
        return pessoarepository.listarPessoas();
    }

    public void excluirPessoa(String id) {
    }
}
