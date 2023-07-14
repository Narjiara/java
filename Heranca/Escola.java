package Heranca;
import java.util.Date;
public class Escola  {
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Narjira","76548935241",new Date());
		System.out.println(aluno1.nome);
		System.out.println(aluno1.cpf);
		System.out.println(aluno1.data_nascimento.toString());		
		
		
		Professor professor1 = new Professor("Joao","12348935241",new Date());
		System.out.println(professor1.nome);
		System.out.println(professor1.cpf);
		System.out.println(professor1.data_nascimento.toString());
		
	}

}
