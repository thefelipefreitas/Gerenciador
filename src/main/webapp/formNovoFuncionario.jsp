<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/novoFuncionario" var="linkServletNovoFuncionario"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulário Novo Funcionário</title>
</head>
	<body>
		
		<form action="${ linkServletNovoFuncionario }" method="post">
		
			Nome: <input type="text" name="nome"/> <br />
			Data Nascimento: <input type="text" name="nascimento"/> <br />
			Cpf: <input type="text" name="cpf"/> <br />
			Email: <input type="text" name="email"/> <br />
			Telefone: <input type="text" name="telefone"/> <br />
		
			<input type="submit" />
		
		</form>
		
	</body>
</html>