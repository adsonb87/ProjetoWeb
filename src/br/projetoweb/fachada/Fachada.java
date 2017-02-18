package br.projetoweb.fachada;

import java.util.ArrayList;

import br.projetoweb.aluno.Aluno;
import br.projetoweb.aluno.ControladorAluno;

public class Fachada {
	
	private ControladorAluno controladorAluno;
	
	private static Fachada fachada;
	
	public static Fachada getInstance(){
		if(fachada == null){
			fachada = new Fachada();
		}
		return fachada;
	}
	
	public Fachada() {
		controladorAluno = new ControladorAluno();
	}
	
	public void cadastrarAluno(Aluno aluno){
		controladorAluno.cadastrarAluno(aluno);
	}
	
	public void atualizarAluno(Aluno aluno){
		controladorAluno.atualizarAluno(aluno);
	}
	
	public Aluno procurarAluno (Integer id){
		return controladorAluno.procurarAluno(id);
	}
	
	public boolean removerUsuario (Integer id){
		return controladorAluno.removerUsuario(id);
	}
	
	public ArrayList<Aluno> listarAlunos(){
		return controladorAluno.listarAlunos();
	}
}
