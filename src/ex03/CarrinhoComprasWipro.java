package ex03;

import java.util.Scanner;

public class CarrinhoComprasWipro {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		int n = sc.nextInt();
	
		
		
		String[] itemNomeProduto = {"Leite","Cereal","Arroz","Atum","Feijão","Azeite","Oleo","Sabao","Sal","Açucar"};
		int[] itemCodProduto = {1,2,3,4,5,6,7,8,9,10};
		int[] itemQuantProd = {10,10,10,10,10,10,10,10,10,10};
		float[] itemPrecoProd = {4.57f,3.02f,9.43f,3.55f,6.55f,4.55f,7.33f,1.99f,3.82f,4.29f};
		
		int codigo;
		int quantidadeDeProduto;
		String continuar;
		
		imprimeItem(itemCodProduto, itemNomeProduto, itemQuantProd, itemPrecoProd);
		
		do {
			System.out.println("Olá! Digite o código do produto desejado:");
			codigo = sc.nextInt();
			System.out.println("Insira a quantidade do produto:");
			quantidadeDeProduto = sc.nextInt();
			System.out.printf("%d un. de %s adicionado com sucesso no carrinho!!", quantidadeDeProduto, itemNomeProduto[codigo -1 ]);
			System.out.println("Deseja continuar a sua compra? [S/N]");
			sc.nextLine();
			continuar = sc.nextLine();
			} while (continuar == "S");

//		String[] carrinhoNomeProduto = new String[n];
//		int[] carrinhoCodProduto = new int[n];
//		int[] carrinhoQuantProd = new int[n];
//		float[] carrinhoPrecoProd = new float[n];
		
		
		

	}

	public static void imprimeItem(int[] itemCodProduto,String[] itemNomeProduto,int[] itemQuantProd,float[] itemPrecoProd) {
		System.out.println("--------------------------------------------------");
		System.out.printf("\t\t WIPRO STORE\n");
		System.out.println("==================================================");
		
		System.out.println("CODIGO\tPRODUTO\tQTND.ITENS\tPRECO UNIT");
		
		for(int i = 0 ;i < itemNomeProduto.length;i++) {
			System.out.printf("%d \t%s\t\t%d\t%.2f \n",itemCodProduto[i] , itemNomeProduto[i], itemQuantProd[i], itemPrecoProd[i]);
		}
		System.out.println();
	}
}