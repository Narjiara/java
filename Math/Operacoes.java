package Math;

public class Operacoes {
	private int a;
	private int b;
	private int c;
	
	public Operacoes() {
	}
	public Operacoes (int a,int b) {
		
		this.a=a;
		this.b=b;
				
	}
	public Operacoes(int a,int b,int c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public void somar(int a, int b) {
		System.out.println(a + b);
		
	}
	public void somar(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	public void subtrair (int a,int b) {
		System.out.println(a - b);
	}
	public void subtrair(int a,int b,int c) {
		System.out.println(a-b-c);
	}
	public void multiplicar (int a,int b) {
		System.out.println(a * b);
	}
	public void multiplicar (int a,int b,int c) {
		System.out.println(a * b);
	}
	public void divisao (int a,int b) {
		System.out.println(a / b);
	}
	public void divisao (int a,int b,int c) {
		System.out.println(a/b/c);
	}
	
	
}
		
		
		
		
		
	

