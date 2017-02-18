package br.projetoweb.fachada;

import br.projetoweb.aluno.Aluno;

public class Teste {

	public static void main(String[] args) {
		
		Fachada f = Fachada.getInstance();
		
		Aluno aluno = new Aluno("André Nunes","000.111.222-22" ,25, "Design gráfico");
		
		
		f.cadastrarAluno(aluno);
		
	}

}
