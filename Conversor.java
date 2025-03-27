package aula_10;

import java.util.Scanner;

public class Conversor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Escreva um numero de 0 a 65535: ");
		int entrada = scan.nextInt();
		int mascara = 32768;

		for (int i = 0; i < 16; i++) {
			if(i % 4 == 0 && i != 0) {
				System.out.print(" ");
			}
			if ((entrada & mascara) == 0) {
				System.out.print("0");
			} else {
				System.out.print("1");
			}
			mascara = mascara / 2;
		}

	}

}
