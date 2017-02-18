<%@page import="br.projetoweb.aluno.Aluno"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listar alunos</title>
</head>
<body>
	
	<table border="1">
		<tr bgcolor="#CCCCCC">
			<th> Id </th> <th> Nome </th> <th> Cpf </th> <th> Idade </th> <th> Curso </th> <th> Acao </th>
		</tr>
	 
<%	
	ArrayList<Aluno> lista = (ArrayList<Aluno>) request.getAttribute("Lista");
	
	for(Aluno aluno : lista){
%>	
		
		<tr>
			<td><% out.print(aluno.getIdAluno()); %></td>
			<td><%= aluno.getNome() %></td>
			<td><%= aluno.getCpf() %></td>
			<td> <%= aluno.getIdade()%></td>
			<td><%= aluno.getCurso() %></td>
			<td>
			
				<a href="alunocontroller.do?acao=exc&id=<%= aluno.getIdAluno()%>"> Excluir</a> 
			
				<a href="alunocontroller.do?acao=alt&id=<%= aluno.getIdAluno()%>"> Alterar</a>	
			</td>
		</tr>
		
	
<% }%>	

	</table>
</body>
</html>