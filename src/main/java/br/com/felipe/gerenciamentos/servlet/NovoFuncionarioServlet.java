package br.com.felipe.gerenciamentos.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/novoFuncionario")
public class NovoFuncionarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String nomeFuncionario = request.getParameter("nome");
		String dataNascimentoFuncionario = request.getParameter("nascimento");
		String cpfFuncionario = request.getParameter("cpf");
		String emailFuncionario = request.getParameter("email");
		String telefoneFuncionario = request.getParameter("telefone");

		Date dataNascimento = null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			dataNascimento = sdf.parse(dataNascimentoFuncionario);
		} catch (ParseException e) {
			throw new ServletException(e);
		}

		Funcionario funcionario = new Funcionario();
		funcionario.setNome(nomeFuncionario);
		funcionario.setDataNasc(dataNascimento);
		funcionario.setCpf(cpfFuncionario);
		funcionario.setEmail(emailFuncionario);
		funcionario.setTelefone(telefoneFuncionario);

		Banco banco = new Banco();
		banco.adicionaFuncionario(funcionario);
		
		request.setAttribute("funcionario", funcionario.getNome());
		response.sendRedirect("listaFuncionarios");

	}

}
