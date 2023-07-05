package Fundamentos;

public class Exercicio30 {
	public static void main(String[] args) {
		int[] arrayNum = {87,68,52,5,49,83,45,12,64};
		int total = 0;
		//adiciona o valor de cada elemento ao total
		for (int i : arrayNum)
			total += i;
		System.out.printf("total de elementos arrayNum:%d\n",total);
			
		
	}

}
