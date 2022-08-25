package interfaces;

import java.util.List;

public interface IAlunoRepository<T> {
	//poderiam ser quaisquer nomes nos metodos
	//T pode ser qualquer coisa = TIPO GENERICO
	void create(T obj) throws Exception;
	
	void update(T obj) throws Exception;
	
	void delete(Integer id) throws Exception; 
	
	List<T> findAll() throws Exception;
	List<T> findById() throws Exception;

}