package br.projetoweb.fachada;

import br.projetoweb.aluno.Aluno;

public class Teste {

	public static void main(String[] args) {
		
		Fachada f = Fachada.getInstance();
		
		Aluno aluno = new Aluno("Adson Barbosa de Souza","111.222.333-44" ,29, "Sistemas da informação");
		
		
		f.cadastrarAluno(aluno);
		
	}

}
