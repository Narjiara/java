package Fundamentos;
import java.util.Scanner;

public class Exercicio13 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("digite o primeiro numero:");
		double resposta = entrada.nextDouble();
		
		System.out.println("digite o segundo numero:");
		double resp2 = entrada.nextDouble();
		
		System.out.println("digite o terceiro numero:");
		double resp3 = entrada.nextDouble();
		
		if (resposta > resp2 && resposta > resp3) {
			System.out.println(resposta + "e o maior");
		}
		else if (resp2 > resposta && resp2 > resp3) {
			System.out.println(resposta + "e o maior");
		}
		else {
			System.out.println(resp3 + "e o maior");
		}
		if (resposta < resp2 && resposta < resp3) {
			System.out.println(resposta + "e o menor");
		}
		else if (resp2 < resposta && resp2 < resp3) {
			System.out.println(resposta + "e o menor");
		}
		else {
			System.out.println(resp3 + "e o menor");
		}
		}
		
		
	}
	
		
		
	


