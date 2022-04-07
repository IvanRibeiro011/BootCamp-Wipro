package ex_04;

public class Quadrado implements FormaGeometrica {

	@Override
	public String cor() {
		return "Azul";
	}

	@Override
	public String quantidadeDeLados() {
		return "4";
	}

	@Override
	public double area(double lado, double lado2) {
		double area = lado * lado2;
		return area;
	}

}
