package br.projetoweb.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
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
		
		String acao = request.getParameter("acao");
		
		
		if(acao != null && acao.equalsIgnoreCase("exc")){
			
			Integer id = Integer.parseInt(request.getParameter("id"));
			
			fachada.removerUsuario(id);	
		}
		
		if(acao != null && acao.equalsIgnoreCase("alt")){
			
			Integer id = Integer.parseInt(request.getParameter("id"));
			
			Aluno aluno = fachada.procurarAluno(id);
			
			request.setAttribute("aluno", aluno);
			
			RequestDispatcher saida = request.getRequestDispatcher("frmaluno.jsp");
			saida.forward(request, response);
		}
		
		
		if(acao != null && acao.equalsIgnoreCase("lis")){		
			ArrayList<Aluno> lista = fachada.listarAlunos();
			
			
			request.setAttribute("Lista", lista);
			
			RequestDispatcher saida =  request.getRequestDispatcher("listaaluno.jsp");
			saida.forward(request, response);
		
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Fachada fachada = Fachada.getInstance();
		
		Integer id = Integer.parseInt(request.getParameter("txtid"));
		String nome = request.getParameter("txtnome");
		String cpf = request.getParameter("txtcpf");
		Integer idade = Integer.parseInt(request.getParameter("txtidade"));
		String curso = request.getParameter("txtcurso");
		
		
		if(id == null){
			Aluno aluno = new Aluno(nome, cpf, idade, curso);
			fachada.cadastrarAluno(aluno);		
		}else{
			Aluno aluno = new Aluno(id, nome, cpf, idade, curso);
			fachada.atualizarAluno(aluno);
		}
		
		PrintWriter saida = response.getWriter();
		saida.println("Aluno Cadastrado");
		
	}

}
