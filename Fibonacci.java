// Utilize o comando for para imprimir os 30 primeiros números da série de
// Fibonacci. A série de Fibonacci é a seguinte: 0, 1, 1, 2, 3, 5, 8, 13, 21, etc.
// Para calculá-la, o primeiro elemento vale 0, o segundo vale 1, e daí por

// diante. O n-ésimo elemento vale o (n-1)-ésimo elemento somado ao (n-2)-ésimo
// elemento (ex: 8 = 3 + 5).

package lista_02;

import java.util.Scanner;

public class Exercicio_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite qualquer número inteiro que eu retornarei a sequência Fibonacci correspondente: ");
		int n = scan.nextInt();
		int contagem, num_anterior, num_atual, resultado;
		num_atual = 1;
		num_anterior = 0;
		
		
		
		if (n >= 3) {
			System.out.printf("A sequência dos %d primeiros números Fibonacci são: 0, 1, ", n);
			n = n - 3;
		}
		
		
		else if (n == 1) {
			System.out.println("A sequência Fibonacci começa com: 0");
			// Aprendi esse comando para encerrar o programa no meio, sem ele o programa ainda executava o "for"
			System.exit(0);
		}
		
		else if (n == 2) {
			System.out.println("Os 2 primeiros números da sequência Fibonacci são: 0 e 1.");
			System.exit(0);
		}
		for (contagem = 0; contagem <= n; contagem++) {
			resultado = num_atual + num_anterior;
			

			// Se for o último número ele vai escrever "e" antes do número e colocar um
			// ponto final depois.
			if (contagem == n) {
				System.out.print("e " + resultado + ".");
				num_anterior = num_atual;
				num_atual = resultado;
			} else {
				System.out.print(resultado + ", ");
				num_anterior = num_atual;
				num_atual = resultado;
			}
			scan.close();
		}
	}
}
