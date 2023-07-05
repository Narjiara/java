package Fundamentos;
import java.util.Scanner;
public class Exercicio31 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num[] = new int[10];
		System.out.println("array1");
		for(int x=0;x<10;x++) {
			System.out.println("digite o numero"+(x+1));
			num[x] = entrada.nextInt();
		}
		int num2[] = new int[10];
		System.out.println("array2");
		for(int x=0;x<10;x++) {
			System.out.println("digite o numero"+(x+1));
			num2[x] = entrada.nextInt();
		}
		int num3[] = new int[10];
		System.out.println("array3");
		for(int x=0;x<10;x++) {
			System.out.println("digite o numero"+(x+1));
			num3[x] = entrada.nextInt();
		}
		int num4[] = new int[10];
		System.out.println("array4");
		for(int x=0;x<10;x++) {
			System.out.println("digite o numero"+(x+1));
			num4[x]= entrada.nextInt();
		}
		for(int x:num) {
			System.out.print(x + " ");
		}
		System.out.println("\n");
		for(int x: num2) {
			System.out.print(x + " ");
		}
		System.out.println("\n");
		for(int x: num3) {
			System.out.print(x + " ");
	}
		System.out.println("\n");
		for(int x: num4) {
			System.out.print(x + " ");
}
		System.out.println("\n");
		entrada.close();
}
}