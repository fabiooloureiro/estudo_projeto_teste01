package entities;

public class Aluno {
	
	private Integer idAluno;
	private String nome;
	private String matricula;
	private String cpf;
	
	public Integer getIdAluno() {
		return idAluno;
	}

	public void setIdAluno(Integer idAluno) {
		this.idAluno = idAluno;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	

	@Override
	public String toString() {
		return "Aluno [idAluno=" + idAluno + ", nome=" + nome + ", matricula=" + matricula + ", cpf=" + cpf
				+ ", getIdAluno()=" + getIdAluno() + ", getNome()=" + getNome() + ", getMatricula()=" + getMatricula()
				+ ", getCpf()=" + getCpf() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
