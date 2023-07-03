package Fundamentos;
import java.util.Scanner;
public class Exercicio22 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("digite um numero: ");
		int resp = entrada.nextInt();
		
		int c = 1;
		
		while(c < resp) {
			if (c%2!=0) {
				System.out.print(c+" ");
			}	
			c++;
	}
		System.out.println();
		int cc = 1;
		while(cc < resp) {
			if (cc%2==0) {
				System.out.print(cc+" ");

	}
			cc++;
		}
	}
}
