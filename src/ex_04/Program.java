package ex_04;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int loop = 0;
		
		LoopImpressao(loop, sc);
		
		sc.close();
	}

	public static void LoopImpressao(int loop,Scanner sc) {
		while(loop==0) {
			System.out.println("Qual Polígono deseja calcular a area?");
			System.out.printf("1-Circulo\n2-Retangulo\n3-Quadrado\n4-Triangulo_Retangulo\n");
			int opcao = sc.nextInt();
			if(opcao==1) {
				System.out.println("Digite o valor do raio para medir a area: ");
				System.out.println("Valor do raio: ");
				double valor2 = sc.nextDouble();
				Circulo circulo = new Circulo();
				System.out.println("Valor da area: " + circulo.area(3.14, valor2));
				System.out.println("Cor do Poligono: " + circulo.cor());
				System.out.println("Deseja Calcular outra area?");
				String opcaoLoop = sc.next();
				if(opcaoLoop.equalsIgnoreCase("n")) {
					loop = 1;
				}
			}
			if(opcao==2) {
				System.out.println("Digite dois valores para medir a area: ");
				System.out.println("Valor 1: ");
				double valor1 = sc.nextDouble();
				System.out.println("Valor 2: ");
				double valor2 = sc.nextDouble();
				Retangulo retangulo = new Retangulo();
				System.out.println("Valor da area: " + retangulo.area(valor1, valor2));
				System.out.println("Cor do Poligono: " + retangulo.cor());
				System.out.println("Deseja Calcular outra area?");
				String opcaoLoop = sc.next();
				if(opcaoLoop.equalsIgnoreCase("n")) {
					loop = 1;
				}
			}
			if(opcao==3) {
				System.out.println("Digite dois valores para medir a area: ");
				System.out.println("Valor 1: ");
				double valor1 = sc.nextDouble();
				double valor2 = valor1;
				Quadrado quadrado = new Quadrado();
				System.out.println("Valor da area: " + quadrado.area(valor1, valor2));
				System.out.println("Cor do Poligono: " + quadrado.cor());
				System.out.println("Deseja Calcular outra area?");
				String opcaoLoop = sc.next();
				if(opcaoLoop.equalsIgnoreCase("n")) {
					loop = 1;
				}
		}
			if(opcao==4) {
				System.out.println("Digite dois valores para medir a area: ");
				System.out.println("Valor 1: ");
				double valor1 = sc.nextDouble();
				System.out.println("Valor 2: ");
				double valor2 = sc.nextDouble();
				TrianguloRetangulo triangulo= new TrianguloRetangulo();
				System.out.println("Valor da area: " + triangulo.area(valor1, valor2));
				System.out.println("Cor do Poligono: " + triangulo.cor());
				System.out.println("Deseja Calcular outra area?");
				String opcaoLoop = sc.next();
				if(opcaoLoop.equalsIgnoreCase("n")) {
					loop = 1;
				}
			}
	}
}
}
