package Math;

public class Ave extends Animal {
	
	public Ave (String nome,int idade) {
		super (nome,idade);
	}
	public void EmitirSom() {
		System.out.printf("%s esta cantando \n ",this.nome);
}
	public void Locomover() {
		System.out.printf("%S esta voando \n",this.nome);
	}
}
