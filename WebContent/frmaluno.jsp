<%@page import="br.projetoweb.aluno.Aluno"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<%	
		Aluno aluno = (Aluno) request.getAttribute("aluno");
	%>
	
	<form action="alunocontroller.do" method="post">
		
 		<label>Id: </label> -->
 		<input type="text" name="txtid" value="<%= aluno.getIdAluno() %>" size="50"/><br><br> -->
		
		<label>Nome: </label>
		<input type="text" name="txtnome" value="<%= aluno.getNome() %>" size="50"/><br><br>
		
		<label>Cpf: </label>
		<input type="text" name="txtcpf" value="<%= aluno.getCpf() %>" maxlength="14" size="50"/><br><br>
		
		<label>Idade: </label>
		<input type="text" name="txtidade" value="<%= aluno.getIdade() %>" size="50"/><br><br>
		
		<label>Curso: </label>
		<input type="text" name= "txtcurso" value="<%= aluno.getCurso() %>" size="50"/><br><br>
		
		<input type="submit" value="Salvar"/>
		
		
	</form>
 
</body>
</html>