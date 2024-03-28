package model.entity;

public class Vacina {

	private String paisOrigem;
    private int estagioPesquisa;
    private String dataInicioPesquisa;
    private String nomePesquisador;


    public Vacina(String paisOrigem, int estagioPesquisa, String dataInicioPesquisa, String nomePesquisador) {
        this.paisOrigem = paisOrigem;
        this.estagioPesquisa = estagioPesquisa;
        this.dataInicioPesquisa = dataInicioPesquisa;
        this.nomePesquisador = nomePesquisador;
    }

    // Getters e Setters
    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    public int getEstagioPesquisa() {
        return estagioPesquisa;
    }

    public void setEstagioPesquisa(int estagioPesquisa) {
        this.estagioPesquisa = estagioPesquisa;
    }

    public String getDataInicioPesquisa() {
        return dataInicioPesquisa;
    }

    public void setDataInicioPesquisa(String dataInicioPesquisa) {
        this.dataInicioPesquisa = dataInicioPesquisa;
    }

    public String getNomePesquisador() {
        return nomePesquisador;
    }

    public void setNomePesquisador(String nomePesquisador) {
        this.nomePesquisador = nomePesquisador;
    }
    
    private int id;
    private String nome;
    private double mediaVacina; // Média das aplicações da vacina

    public Vacina(int id, String nome, double mediaVacina) {
        this.id = id;
        this.nome = nome;
        this.mediaVacina = mediaVacina;
    }

    // Getters e setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getMediaVacina() {
        return mediaVacina;
    }

    public void setMediaVacina(double mediaVacina) {
        this.mediaVacina = mediaVacina;
    }

	public int getSituacao() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
