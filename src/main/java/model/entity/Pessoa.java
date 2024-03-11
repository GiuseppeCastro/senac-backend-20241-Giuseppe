package model.entity;

public class Pessoa {
	
	private String nome;
	private String DataNascimento;
	private char Sexo;
	private String CPF;
	
	public Pessoa (String nome, String DataNascimento, char Sexo, String CPF) {
		this.nome = nome;
		this.DataNascimento = DataNascimento;
		this.Sexo = Sexo;
		this.CPF= CPF;
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public String getDataNascimento() {
		return DataNascimento;
	}
	
	public void setDataNascimento(String DataNascimento) {
		this.DataNascimento = DataNascimento;
	}
	
	public char getSexo() {
		return Sexo;
	}
	
	public void setSexo(char Sexo) {
		this.Sexo = Sexo;
	}
	
	public String getCPF() {
		return CPF;
	}
	
	public void setCPF(String CPF) {
		this.CPF = CPF;
	}
	

}
