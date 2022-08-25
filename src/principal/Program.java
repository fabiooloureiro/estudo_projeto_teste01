package principal;

import controllers.AlunoController;

public class Program{
	
	public static void main(String[] args) {
		//instanciando o controlador
		AlunoController alunoController = new AlunoController();
		alunoController.cadastrarAluno();
	}
	
}