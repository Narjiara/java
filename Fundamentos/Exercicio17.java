package Fundamentos;
import java.util.Scanner;
public class Exercicio17 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int cont = 0;
		
		System.out.println("voce telefonou para vitima ?");
		char resp = entrada.next().charAt(0);
		if (resp == 's' ) {
			cont++;
			
		}
	
		System.out.println("voce esteve no local do crime ?");
		char resp2 = entrada.next().charAt(0);
		if (resp2 == 's' ) {
			cont++;
		}
		
		System.out.println("voce mora perto da vitima ?");
		char resp3 = entrada.next().charAt(0);
		if (resp3 == 's' ) {
			cont++;
		}
		
		System.out.println("voce devia a vitima ?");
		char resp4 = entrada.next().charAt(0);
		if (resp4 == 's' ) {
			cont++;
		}
		System.out.println("ja trabalhou com a vitima ?");
		char resp5 = entrada.next().charAt(0);
		if (resp5 == 's' ) {
			cont++;	
		}
        if (cont == 2) {
        	System.out.println("suspeito");	
        }
        else if (cont == 3) {
        	System.out.println("cumplice");
        }
        else if (cont == 5) {
        	System.out.println("assassino");
        }
        else {
        	System.err.println("inocente");
        }
	}

}
