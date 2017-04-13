package br.com.fabricadeprogramador;

import br.com.fabricadeprogramador.persistencia.entidade.Usuario;
import br.com.fabricadeprogramador.persistencia.jdbc.UsuarioDAO;

public class TestUsuarioDAO {

	public static void main(String[] args) {
		//testCadastrar();
		//testAlterar();
		testExcluir();
	}

	public static void testCadastrar() {

		Usuario usu = new Usuario();

		usu.setNome("Jãozao");
		usu.setLogin("jzao");
		usu.setSenha("123");

		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.cadastrar(usu);

		System.out.println("Cadastrado com sucesso.");

	}

	public static void testAlterar() {

		Usuario usu = new Usuario();
		usu.setId(7);
		usu.setNome("Jãozao Cavalo");
		usu.setLogin("jzaoggggg");
		usu.setSenha("123rrrrrr");

		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.alterar(usu);

		System.out.println("Alterado com sucesso.");

	}
	
	public static void testExcluir() {

		Usuario usu = new Usuario();
		usu.setId(7);
		
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.excluir(usu);

		System.out.println("Excluído com sucesso.");

	}

}
