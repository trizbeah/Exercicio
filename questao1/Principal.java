package questao1;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Zerinho z = new Zerinho();
		
		String teste = "";
		
		while(!teste.equals("Voc� acertou!")) {
			System.out.println("Digite um n�mero: ");
			teste  = z.verificar(sc.nextInt());
			
			System.out.println(teste);
		}
		
		System.out.println(z.imprimirTentativas());
		
		sc.close();
		
	}

}
