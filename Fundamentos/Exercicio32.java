package Fundamentos;
import java.util.Scanner;
public class Exercicio32 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double notas[] = new double[5];
		double soma=0;
		double media=0;
		for(int i=0;i<5;i++) {
			System.out.println("digite uma nota:");
			notas[i]=entrada.nextDouble();			 
		}
		for(int x=0;x<5;x++) {
		soma+=notas[x];			
	}     
		media = soma/5;
		System.out.println(media);
	}

}
