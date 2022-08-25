package controllers;

import java.util.Scanner;

import entities.Aluno;
import repositories.AlunoRepository;


public class AlunoController {

	//metodo para realizar o cadastro de pessoa no sistema
	
	public void cadastrarAluno() {
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.println("\n *** CADASTRO DO ALUNO ***  \n");
			
			Aluno aluno = new Aluno();
			
			System.out.print("Informe o nome do aluno.....");
			aluno.setNome(scanner.nextLine());
			
			System.out.print("Informe a matricula do aluno.....");
			aluno.setMatricula(scanner.nextLine());
			
			System.out.print("Informe o CPF do aluno.....");
			aluno.setCpf(scanner.nextLine());
			
			//gravando no banco de dados
			AlunoRepository alunoRepository = new AlunoRepository();
			alunoRepository.create(aluno);
			
			System.out.println("\nAluno cadastrado com sucesso.");
		}
		catch(Exception e) {
			
			System.out.println("\nErro: " +e.getMessage());
		}
	}

	
}