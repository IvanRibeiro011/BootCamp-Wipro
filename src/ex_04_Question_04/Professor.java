package ex_04_Question_04;

public class Professor extends Funcionario {

	private static final double bonus= 1.30;
	
	public Professor() {
		
	}
	
	public Professor(String cpf, String nome) {
		super(cpf, nome);
	}

	public Professor(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
	}

	@Override
	public double calculaSalario() {
		return getSalario() * bonus;
	}
}
