<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, br.com.felipe.gerenciamentos.servlet.Funcionario" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de Funcionários</title>
</head>
	<body>
		<c:if test="${ not empty funcionario }">
				Funcionario ${ funcionario } cadastrado! <br />
		</c:if>
		
		<strong>Lista de Funcionários:</strong> <br />
		<ul>
		
			<c:forEach items="${funcionarios}" var="f">
				<li>
					<strong>Nome Completo: </strong>${ f.nome } <br />
					<strong>Data de Nascimento: </strong><fmt:formatDate value="${ f.dataNasc }" pattern="dd/MM/yyyy"/> <br />
					<strong>CPF: </strong>${ f.cpf } <br />
					<strong>Email: </strong>${ f.email } <br />
					<strong>Telefone: </strong>${ f.telefone } <br />
				</li>
			--------------------------------------------------------
			</c:forEach>
		
		</ul>		
		
	</body>
</html>