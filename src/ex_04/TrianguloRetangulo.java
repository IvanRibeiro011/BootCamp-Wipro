package ex_04;

public class TrianguloRetangulo implements FormaGeometrica{

	@Override
	public String cor() {
		return "Verde";
	}

	@Override
	public String quantidadeDeLados() {
		return "3";
	}

	@Override
	public double area(double cateto1, double cateto2) {
		double area = cateto1*cateto2/2;
		return area;
	}

}
