package model;

import java.sql.Connection;
import java.sql.DriverManager;

public class DAO {
//CRIANDO VARIÁVEIS ENCAPSULADAS PARA ACESSO AO BANCO
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://10.26.49.101:3306/agenda";
	private String user = "root";
	private String password = "123@senac";

	/**
	 * Metodo responsavel por abrir uma conexao com banco
	 * 
	 * @return con
	 */
	public Connection conectar() {

		// Criar um objeto
		Connection con = null;

		// tratamento de exceções
		try {
			//logica principal para abrir a conexao
			Class.forName(driver);
			//Obter os parametros da conexão (informações do servidor)
			con = DriverManager.getConnection(url, user, password); //conectar!
			//retornar a conexão ("abrir a porta da geladeira")
			return con;

		} catch (Exception e) {
			System.out.println(e);
			return null;

		}

	}

}
