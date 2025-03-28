package aula_10;

import java.util.Scanner;

public class Conversor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Escreva um numero de 0 a 65535: ");
		int entrada = scan.nextInt();

		// Declarando que minha máscara binária inicia como 32.768.
		// 32.768 = 1000 0000 0000 0000 bin
		int mascara = 32768;

		for (int i = 0; i < 16; i++) {

			// a cada 4 repetições ele da um espaçamento na linha.
			if(i % 4 == 0 && i != 0) {
				System.out.print(" ");
			}

			// Vai iniciar o mascaramento comparando (&) minha entrada com minha máscara
			// XXXX XXXX XXXX XXXX 
			// 1000 0000 0000 0000
			if ((entrada & mascara) == 0) {
				//Se no mascaramento o resultado lógico for "1", ele escreve "1".
				System.out.print("0");
			}

			//Se no mascaramento o resultado lógico for "0", ele escreve "0".
			else {
				System.out.print("1");
			}
			
			// Após a comparação, divide o valor da mascara na metade, tornando 16.384.
			// 16.384 = 0100 0000 0000 0000
			mascara = mascara / 2;
			
			// O ciclo vai se repetir e a cada repetição o o "1" da mascara vai deslocando até varrer a variavel inteira:
			// 1º  repetição: 1000 0000 0000 0000
			// 2º  repetição: 0100 0000 0000 0000
			// 3º  repetição: 0010 0000 0000 0000
			// 4º  repetição: 0000 1000 0000 0000
			// 5º  repetição: 0000 0100 0000 0000
			// 6º  repetição: 0000 0010 0000 0000
			// 7º  repetição: 0000 0001 0000 0000
			// 8º  repetição: 0000 0000 1000 0000
			// 9º  repetição: 0000 0000 0100 0000
			// 10º repetição: 0000 0000 0010 0000
			// 11º repetição: 0000 0000 0001 0000
			// 12º repetição: 0000 0000 0000 1000
			// 13º repetição: 0000 0000 0000 0100
			// 14º repetição: 0000 0000 0000 0010
			// 15º repetição: 0000 0000 0000 0001
			
		}

	}

}
