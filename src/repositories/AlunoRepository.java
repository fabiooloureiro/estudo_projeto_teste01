package repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import entities.Aluno;
import factories.ConnectionFactory;
import interfaces.IAlunoRepository;

public class AlunoRepository implements IAlunoRepository<Aluno> {

	@Override
	public void create(Aluno obj) throws Exception {
		
		//abrindo conexao com banco de dados
		Connection connection = ConnectionFactory.createConnection();
				
		//executanto um comando SQL no banco de dados
		//NOME PESSOA É O NOME DA TABELA                            COMANDO SQL             
		PreparedStatement statement = connection.prepareStatement("INSERT INTO PESSOA(NOME, MATRICULA, CPF) VALUES(?, ?, ?)");		
		statement.setString(1, obj.getNome());
		statement.setString(2, obj.getMatricula());
		statement.setString(3, obj.getCpf());
		statement.execute();
		
		
		//fechar a conexão
		connection.close();
		

	}

	@Override
	public void update(Aluno obj) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer id) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Aluno> findAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Aluno> findById() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}	

