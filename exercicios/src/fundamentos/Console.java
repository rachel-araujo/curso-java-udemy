package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print(" dia!\n\n");
		
		System.out.println("Bom");
		System.out.println("dia!");
		
		System.out.printf("Megasena: %d %d %d %d %d %d %n", 1, 2, 3, 4, 5, 6);//formatado - usar \n para quebra de linha
		
		System.out.printf("Sal�rio: %.1f%n", 1234.5678); //mostra uma casa decimal e faz arredondamento
		
		System.out.printf("Nome: %s%n", "Jo�o");
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.printf("%s %s tem %d anos.%n", nome, sobrenome, idade);
		
		//System.out.println("\n\nNome = " + nome +" "+ sobrenome);
		
		entrada.close();//� necess�rio fechar o programa, para economizar mem�ria da m�quina

	}

}
