package model.entity;

public class Aplicacao {

	private String dataAplicacao;
    private Pessoa pessoaRecebeu;
    private int reacao;

    // Constructor
    public Aplicacao(String dataAplicacao, Pessoa pessoaRecebeu, int reacao) {
        this.dataAplicacao = dataAplicacao;
        this.pessoaRecebeu = pessoaRecebeu;
        this.reacao = reacao;
    }

    // Getters e Setters
    public String getDataAplicacao() {
        return dataAplicacao;
    }

    public void setDataAplicacao(String dataAplicacao) {
        this.dataAplicacao = dataAplicacao;
    }

    public Pessoa getPessoaRecebeu() {
        return pessoaRecebeu;
    }

    public void setPessoaRecebeu(Pessoa pessoaRecebeu) {
        this.pessoaRecebeu = pessoaRecebeu;
    }

    public int getReacao() {
        return reacao;
    }

    public void setReacao(int reacao) {
        this.reacao = reacao;
    }

	public int getIdVacina() {
		// TODO Auto-generated method stub
		return 0;
	}

	public double getNota() {
		// TODO Auto-generated method stub
		return 0;
	}

	public Object getIdPessoa() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
