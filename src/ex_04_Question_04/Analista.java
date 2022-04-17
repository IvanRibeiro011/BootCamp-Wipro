package ex_04_Question_04;

public class Analista extends Funcionario {

	private static final double bonus = 1.15;

	public Analista() {
		
	}
	
	public Analista(String cpf, String nome) {
		super(cpf, nome);
		
	}
	
	public Analista(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
		
	}
	
	@Override
	public double calculaSalario() {
		return this.getSalario() * bonus;
	}
}
