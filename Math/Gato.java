package Math;

public class Gato extends Animal{
	public Gato(String nome,int idade) {
		super (nome,idade);
	}
	public void EmitirSom() {
		System.out.printf("%s esta miando \n ",this.nome);
}
	public void Locomover() {
		System.out.printf("%S esta correndo \n",this.nome);
}
}