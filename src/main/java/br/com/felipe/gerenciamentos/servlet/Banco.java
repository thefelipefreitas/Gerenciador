package br.com.felipe.gerenciamentos.servlet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {

	private static List<Funcionario> lista = new ArrayList<>();
	private static Integer chaveSequencial = 1;

	static {
		Funcionario funcionario = new Funcionario();
		funcionario.setId(chaveSequencial++);
		funcionario.setNome("Tatiana Mendes");
		funcionario.setCpf("923.201.742-09");
		funcionario.setEmail("tati@gmail.com");
		funcionario.setTelefone("3872-9382");
		lista.add(funcionario);

	}

	public void adicionaFuncionario(Funcionario funcionario) {
		funcionario.setId(Banco.chaveSequencial++);
		lista.add(funcionario);
	}

	public void removeFuncionario(Integer id) {

		Iterator<Funcionario> it = lista.iterator();

		while (it.hasNext()) {
			Funcionario func = it.next();

			if (func.getId() == id) {
				it.remove();
			}
		}
	}

	public Funcionario buscaFuncionarioById(Integer id) {

		for (Funcionario funcionario : lista) {
			if (funcionario.getId() == id) {
				return funcionario;
			}
		}
		return null;
	}

	public List<Funcionario> getAllFuncionarios() {
		return Banco.lista;
	}

}
