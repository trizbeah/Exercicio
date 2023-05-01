package questao5;

import java.util.Scanner;

public class Principal {

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			JogoDaVelha jogo = new JogoDaVelha();
			String posicao;
			int valida = 0, Jogadas = 0;
			
			while(true) {
				System.out.println(":::::::JOGO DA VELHA:::::::");
				jogo.Mostrar();
				
				do {//inicia Jogador 1
					System.out.println("Jogador 1, informe uma posição: ");
					posicao = scan.next();
					while(!jogo.Valido(posicao)) {
						System.out.println("Jogada inválida, tente novamente!");
						System.out.println("Jogador 1, informe uma posição: ");
						posicao = scan.next();
						valida = 0;
					}
					jogo.Jogada(posicao, "X");
					valida = 1;
					
				}while(valida == 0); //fim Jogador 1
				
				Jogadas++;
				valida = 0;
				jogo.Mostrar();
				if(!jogo.Ganhou(Jogadas).equals("null")) {
					break;
				}
				
				do {//inicia Jogador 2
					System.out.println("Jogador 2, informe uma posição: ");
					posicao = scan.next();
					while(!jogo.Valido(posicao)) {
						System.out.println("Jogada inválida, tente novamente!");
						System.out.println("Jogador 2, informe uma posição: ");
						posicao = scan.next();
						valida = 0;
					}
					jogo.Jogada(posicao, "O");
					valida = 1;
					
					
				}while(valida == 0); //fim Jogador 2
				
				Jogadas++;
				valida = 0;
				jogo.Mostrar();
				if(!jogo.Ganhou(Jogadas).equals("null")) {
					break;
				}
			}
			System.out.println("O "+jogo.Ganhou(Jogadas)+" venceu!");
			
			scan.close();
		}
}
