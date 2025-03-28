// 5. Imprima os fatoriais de 1 a 10.

package lista_02;

public class Exercicio_05 {

	public static void main(String[] args) {
		int contagem, resultado, n;
		n = 1;
		resultado = 1;

		for (contagem = 1; contagem <= 10; contagem++) {
			// fazendo "resultado" * "contagem" ele vai deixando guardado os fatoriais
			// anteriores e multiplicando pelo número incrementado, que no caso é a contagem
			resultado = resultado * (contagem);

			// Esse if é para caso queira o fatorial de 0, pois o fatorial de 0 é 1, logo
			// todo resultado que for menor que 1, ele vai receber o valor "1"
			if (resultado <= 1) {
				resultado = 1;
			}

			System.out.println("O fatorial de " + n + " (" + n + "!) é: " + resultado);
			n++;

		}
	}

}
