package helloWord;

import java.util.Scanner;

public class HelloW {

	public static void main(String[] args) {
		
		String nome; 
		int anoNascimento;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o nome do cidadao: ");
		nome = sc.nextLine();
		System.out.println("Informe o ano de nascimento: ");
		anoNascimento = sc.nextInt();
		
		String resposta = "Olá " + nome + "\n"; 
		resposta += "Você tem " + (2023 - anoNascimento) + " anos de idade. ";
		
		System.out.println(resposta);

	}
}
