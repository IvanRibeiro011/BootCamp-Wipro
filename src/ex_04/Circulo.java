package ex_04;

public class Circulo implements FormaGeometrica {

	@Override
	public String cor() {
		return "Vermelho";
	}

	@Override
	public String quantidadeDeLados() {
		return "0";
	}

	@Override
	public double area(double PI, double raio) {
		return PI * (raio*raio);
	}

}
