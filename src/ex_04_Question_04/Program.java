package ex_04_Question_04;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Analista analista = new Analista();
		Professor professor = new Professor();
		
		System.out.println("Você deseja criar um cadastro de qual funcionario?");
		System.out.printf("1- Analista\n2- Professor");
		int opcao = sc.nextInt();
		if(opcao == 1) {
			System.out.println("Digite o nome: ");
			String nome = sc.next();
			System.out.println("Digite o cpf somente com números: ");
			String cpf = sc.next();
			System.out.println("Digite o salario base: ");
			double salario = sc.nextDouble();
			analista = new Analista(nome, cpf,salario);
			System.out.printf("Dados do funcionario: \n");
			System.out.println("Nome: " + analista.getNome());
			System.out.println("cpf: " + analista.getCpf());
			System.out.println("Salario: " + analista.getSalario());
			System.out.println("Salario com bonus: " + analista.calculaSalario());
		}
		if(opcao == 2) {
			System.out.println("Digite o nome: ");
			String nome = sc.next();
			System.out.println("Digite o cpf somente com números: ");
			String cpf = sc.next();
			System.out.println("Digite o salario base: ");
			double salario = sc.nextDouble();
			professor = new Professor(nome, cpf, salario);
			System.out.printf("Dados do funcionario: \n");
			System.out.println("Nome: " + professor.getNome());
			System.out.println("cpf: " + professor.getCpf());
			System.out.println("Salario: " + professor.getSalario());
			System.out.println("Salario com bonus: " + professor.calculaSalario());
		}

		sc.close();
	}

}
