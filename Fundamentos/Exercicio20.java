package Fundamentos;
import java.util.Scanner;
public class Exercicio20 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Quantos alunos tem na sua sala ?");
		int resp = entrada.nextInt();
		
		int c = 0;
		float snota = 0;
		
		while (c <= resp-1 ) {
			System.out.println("qual a media do aluno");
			float nota = entrada.nextInt();
			snota += nota;
			c++;
		}
		 System.out.println(snota/resp);
	}

}
