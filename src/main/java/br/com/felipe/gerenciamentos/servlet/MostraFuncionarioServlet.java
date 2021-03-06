package br.com.felipe.gerenciamentos.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mostraFuncionario")
public class MostraFuncionarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		
		Banco banco = new Banco();
		Funcionario funcionario = banco.buscaFuncionarioById(id);

		request.setAttribute("funcionario", funcionario);
		RequestDispatcher rd = request.getRequestDispatcher("/formAlteraFuncionario.jsp");
		rd.forward(request, response);
		
		
	}

}
