package Fundamentos;

public class Exercicio33 {
	public static void main(String[] args) {
		String str = "Hello world";
		String resultado = str.replace("l","w");
		String resultado2 = str.substring(6);
		String resultado3 = str.substring(3,8);
		String resultado4 = str.trim();
		char resultado5 = str.charAt(1);
		String s1 = "Hello"; 
		String s2 = "HELLO";
		boolean b1 = s1.equals("Hello");
		boolean b2 = s1.equals(s2);
		boolean b3 = s1.equalsIgnoreCase(s2);
		boolean b4 = s1.equalsIgnoreCase("azul");
		int tam = str.length();
		System.out.println(resultado);
		System.out.println(resultado2);
		System.out.println(resultado3);
		System.out.println(resultado4);
		System.out.println(resultado5);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(tam);
	}

}
