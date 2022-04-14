package ex_04_Question_04;

public class Funcionario {

	private String nome;
	private String cpf;
	private double salario;

	public Funcionario() {
	}

	public Funcionario(String cpf, String nome) {
		this.nome = nome;
		this.cpf = cpf;
	}

	public Funcionario(String nome, String cpf, double salario) {
		this.nome = nome;
		this.cpf = cpf;		      
		this.salario = salario;
	}

	public double calculaSalario() {
		return this.getSalario();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double calculaSalario(double bonus) {
		return salario * bonus;
	}
}
