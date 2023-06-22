package Fundamentos;
import java.util.Scanner;

public class Exercicio15 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("digite a primeira numero:");
        double resp = entrada.nextDouble();
       
		System.out.println("digite a segunda numero:");
        double resp2 = entrada.nextDouble();
        
        double media = (resp + resp2)/ 2;
        System.out.println(media + " media do aluno");
	}

}
