package exercicios;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		boolean programaEmExecucao = true;
		
		int opcaoForma;
		Scanner sc = new Scanner(System.in);
		
		while(programaEmExecucao) {
			
			
			System.out.println("Informe o número da Figura ou digite 0 para cancelar: \n 1. Triângulo \n 2. Quadrado ");
			opcaoForma = sc.nextInt();
			
			if(opcaoForma == 1) {
				
				int base, altura;
				float area; 
				System.out.println("Informe a Base:\n ");
				base = sc.nextInt();
				System.out.println("Informe a Altura: ");
				altura = sc.nextInt();
				
				area = calculaAreaTriangulo(base, altura) ; 
				
				System.out.println("Sua área é: " + area);
			}else if(opcaoForma == 0) {
				programaEmExecucao = false; 
			}
		}
	}

	private static float calculaAreaTriangulo(int base, int altura) {
		
		
		return (base * altura)/2;
	}
}
