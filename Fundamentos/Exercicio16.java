package Fundamentos;
import java.util.Scanner;

public class Exercicio16 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("digite F ou M:");
		char resp = entrada.next().charAt(0);
		if (resp == 'F') {
			System.out.println( "feminino" );
		}
		else if (resp == 'M') {
			System.out.println("masculino");
		}
		
		
		
	}

}
