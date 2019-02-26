import java.util.Scanner;

public class TestaCondicional {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		
		int idade;
		int acompanhantes;
		
		System.out.println("Qual a sua idade ?");
		idade = entrada.nextInt();
		
		System.out.println("Quantos Acompanhantes você possui?");
		acompanhantes = entrada.nextInt(); 
		
		if(idade >= 18 || acompanhantes >= 3){
			
			System.out.println("Liberado");
			
		}
	
		else {
			
			System.out.println("Sai daqui");
			
		}
	}
}