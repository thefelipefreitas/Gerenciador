<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<c:url value="/alteraFuncionario" var="linkServletNovoFuncionario"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Altera Funcionário</title>
</head>
	<body>
		
		<form action="${linkServletNovoFuncionario}" method="post">
		
			Nome: <input type="text" name="nome" value="${ funcionario.nome }"/> <br />
			Data Nascimento: <input type="text" name="nascimento" value="<fmt:formatDate value="${ funcionario.dataNasc }" pattern="dd/MM/yyyy"/>" /> <br />
			Cpf: <input type="text" name="cpf" value="${ funcionario.cpf }"/> <br />
			Email: <input type="text" name="email" value="${ funcionario.email }"/> <br />
			Telefone: <input type="text" name="telefone" value="${ funcionario.telefone }"/> <br />
			<input type="hidden" name="id" value="${ funcionario.id }">
			
			<input type="submit" />
		
		</form>
	</body>
</html>