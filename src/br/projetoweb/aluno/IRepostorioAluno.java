package br.projetoweb.aluno;

import java.util.ArrayList;

public interface IRepostorioAluno {
	
	public void cadastrar(Aluno aluno);
	public Aluno procurar(Integer id);
	public void atualizar(Aluno aluno);
	public boolean remover(Integer id);
	public ArrayList<Aluno> listar();
}
