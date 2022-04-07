package ex_04;

public class Retangulo implements FormaGeometrica {

	@Override
	public String cor() {
		return "Amarelo";
	}

	@Override
	public String quantidadeDeLados() {
		return "4";
	}

	@Override
	public double area(double base, double altura) {
		double area = base * altura;
		return area;
	}

}
