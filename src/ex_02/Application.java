package ex_02;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Inicie com o nome de 4 pessoas para a votação:");

		//Aqui definiremos o número dos 4 candidatos que receberão votos
		System.out.println("Pessoa 1: ");
		String Pessoa1 = sc.next();
		System.out.println("Pessoa 2: ");
		String Pessoa2 = sc.next();
		System.out.println("Pessoa 3: ");
		String Pessoa3 = sc.next();
		System.out.println("Pessoa 4: ");
		String Pessoa4 = sc.next();

		System.out.println();
		System.out.println("Digite a quantidade de alunos:");
		//Aqui definiremos a quantidade Alunos a votar
		int alunos = sc.nextInt();
		//Declaração de votos que serão contados em um laço de repetição
		int votoP1 = 0;
		int votoP2 = 0;
		int votoP3 = 0;
		int votoP4 = 0;

		for (int i=0;i<alunos;i++) {
			
			System.out.println("inicie a votação");
			System.out.println("Candidato: ");
			System.out.printf("1:%s\n" , Pessoa1);
			System.out.printf("2:%s\n", Pessoa2);
			System.out.printf("3:%s\n", Pessoa3);
			System.out.printf("4:%s\n", Pessoa4);
			System.out.println("Hora da votação (1 a 4)");
			int voto = sc.nextInt();
			
			if (voto == 1) {
				votoP1 += 1;
			} else if (voto == 2) {
				votoP2 += 1;
			} else if (voto == 3) {
				votoP2 += 1;
			} else if (voto == 4) {
				votoP2 += 1;
			}
		}
		
		if(votoP1>votoP2 && votoP1>votoP3 &&votoP1>votoP4) {
			System.out.println("Eleito: " + Pessoa1);
		}
		else if(votoP2>votoP1 && votoP2>votoP3 &&votoP2>votoP4) {
			System.out.println("Eleito: " + Pessoa2);
		}
		else if(votoP3>votoP1 && votoP3>votoP2 &&votoP3>votoP4) {
			System.out.println("Eleito: " + Pessoa3);
		}
		else if(votoP4>votoP1 && votoP4>votoP2 &&votoP4>votoP3) {
			System.out.println("Eleito: " + Pessoa4);
		}
		else {
			System.out.println("Empate detectado , votação precisará ser refeita");
		}
		
		sc.close();

	}

}
