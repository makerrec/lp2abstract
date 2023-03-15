package Pacote;

public abstract class Pessoa {
	
	private String nome;
	private String dataNascimento;
	
	public Pessoa(String nome, String dataNascimento) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	@Override
	public String toString() {
		return String.format("-Pessoa:%s\n-Data de Nacimento:%s\n",this.getNome(),  this.getDataNascimento());
	}
}
