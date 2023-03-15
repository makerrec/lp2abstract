package Pacote;

public class Estudante extends Pessoa {
	private int ra;
	private String curso;
	
	@Override
	public String toString() {
		return String.format("-Estudante:%s\n-Data de Nacimento:%s\n-RA:%d\n-Curso:%s\n",this.getNome(),  this.getDataNascimento(),this.getRa(),this.getCurso());
	}
	public Estudante(String nome, String dataNascimento, int ra, String curso) {
		super(nome, dataNascimento);
		this.ra = ra;
		this.curso = curso;
	}
	public Estudante(String nome, String dataNascimento) {
		super(nome, dataNascimento);
	}
	public int getRa() {
		return ra;
	}
	public void setRa(int ra) {
		this.ra = ra;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}	
}
