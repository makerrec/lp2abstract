package Pacote;

public class Professor extends Pessoa {
	private int siape;
	private String areaConcurso;
	
	public Professor(String nome, String dataNascimento, int siape, String areaConcurso) {
		super(nome, dataNascimento);
		this.siape = siape;
		this.areaConcurso = areaConcurso;
	}
	public Professor(String nome, String dataNascimento) {
		super(nome, dataNascimento);
	}
	public int getSiape() {
		return siape;
	}
	public void setSiape(int siape) {
		this.siape = siape;
	}
	public String getAreaConcurso() {
		return areaConcurso;
	}
	public void setAreaConcurso(String areaConcurso) {
		this.areaConcurso = areaConcurso;
	}
	@Override
	public String toString() {
		return String.format("-Professor:%s\n-Data de Nacimento:%s\n-SIAPE:%d\n-Area de Concurso:%s\n",this.getNome(),  this.getDataNascimento(),this.getSiape(),this.getAreaConcurso());
	}
}
