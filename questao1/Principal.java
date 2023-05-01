package questao1;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Zerinho z = new Zerinho();
		
		String teste = "";
		
		while(!teste.equals("Você acertou!")) {
			System.out.println("Digite um número: ");
			teste  = z.verificar(sc.nextInt());
			
			System.out.println(teste);
		}
		
		System.out.println(z.imprimirTentativas());
		
		sc.close();
		
	}

}
