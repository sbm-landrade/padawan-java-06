package br.com.alura.jdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.alura.jdbc.factory.ConnectionFactory.ConnectionFactory;

public class TestaRemocao {

	public static void main(String[] args) throws SQLException{
		
		ConnectionFactory criaConexao = new ConnectionFactory();
		Connection connection = criaConexao.recuperarConexao();
		
		PreparedStatement stm = connection.prepareStatement("DELETE FROM PRODUTO WHERE ID > ?");
		stm.setInt(1, 2);
		stm.execute();
		
		Integer linhasModificadas = stm.getUpdateCount();
		
		System.out.println("Quantidades de linhas que foram modificadas: " + linhasModificadas);
		
	}

}
