package model.entity;

public class AvaliacaoReacao {

	private String dataAplicacao;
	private Pessoa pessoaRecebida;
	private int reacao;
	
	public AvaliacaoReacao (String dataAplicao, Pessoa pessoaRecebida, int reacao) {
		this.dataAplicacao = dataAplicacao;
		this.pessoaRecebida = pessoaRecebida;
		this.reacao = reacao;
	}
	
	public String getDataAplicacao() {
		return dataAplicacao;
	}
	
	public void setDataAplicacao(String dataAplicacao) {
        this.dataAplicacao = dataAplicacao;
    }

    public Pessoa getPessoaRecebida() {
        return pessoaRecebida;
    }

    public void setPessoaRecebida(Pessoa pessoaRecebida) {
        this.pessoaRecebida = pessoaRecebida;
    }

    public int getReacao() {
        return reacao;
    }

    public void setReacao(int reacao) {
        this.reacao = reacao;
    }
	
}
