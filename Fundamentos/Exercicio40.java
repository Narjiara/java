package Fundamentos;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Exercicio40 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("digite uma frase");
		String frase = entrada.nextLine();
		StringTokenizer exemplo = new StringTokenizer(frase);
		System.out.println(exemplo.countTokens());
	}

}
