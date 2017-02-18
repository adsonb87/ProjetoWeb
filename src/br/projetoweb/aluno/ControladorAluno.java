package br.projetoweb.aluno;

import java.util.ArrayList;

public class ControladorAluno {
	
	private IRepostorioAluno repostorioAluno;
	
	public ControladorAluno() {
		repostorioAluno = new RepositorioAluno();
	}
	
	public void cadastrarAluno(Aluno aluno){
		repostorioAluno.cadastrar(aluno);
	}
	
	public void atualizarAluno(Aluno aluno){
		repostorioAluno.atualizar(aluno);
	}
	
	public Aluno procurarAluno (Integer id){
		return repostorioAluno.procurar(id);
	}
	
	public boolean removerUsuario (Integer id){
		return repostorioAluno.remover(id);
	}
	
	public ArrayList<Aluno> listarAlunos(){
		return repostorioAluno.listar();
	}
}
