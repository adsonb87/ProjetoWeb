package br.projetoweb.aluno;

public class Aluno {
	
	private Integer idAluno;
	private String nome;
	private String cpf;
	private int idade;
	private String curso;
	
	public Aluno(Integer idAluno, String nome, String cpf, int idade, String curso) {
		this.idAluno = idAluno;
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.curso = curso;
	}
	
	public Aluno(String nome, String cpf, int idade, String curso) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.curso = curso;
	}
	
	public Aluno() {
		// TODO Auto-generated constructor stub
	}

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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Aluno [idAluno=" + idAluno + ", nome=" + nome + ", cpf=" + cpf + ", idade=" + idade + ", curso=" + curso
				+ "]\n";
	}
	
	
}
