package br.projetoweb.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.projetoweb.aluno.Aluno;
import br.projetoweb.fachada.Fachada;

/**
 * Servlet implementation class AlunoController
 */
@WebServlet("/alunocontroller.do")
public class AlunoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public AlunoController() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Fachada fachada = Fachada.getInstance();
		ArrayList<Aluno> lista = fachada.listarAlunos();
		
		PrintWriter saida = response.getWriter();
		saida.println(lista.toString());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		String nome = request.getParameter("txtnome");
		String cpf = request.getParameter("txtcpf");
		int idade = Integer.parseInt(request.getParameter("txtidade"));
		String curso = request.getParameter("txtcurso");
		
		Fachada fachada = Fachada.getInstance();
		Aluno aluno = new Aluno(nome, cpf, idade, curso);
		fachada.cadastrarAluno(aluno);		
		
		PrintWriter saida = response.getWriter();
		saida.println("Aluno "+ aluno.getNome() + " Cadastrado");
		
	}

}
