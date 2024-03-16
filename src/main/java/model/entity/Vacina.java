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
	
	
}
