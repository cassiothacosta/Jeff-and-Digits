package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		int numeroCartas = in.nextInt();
		List<Integer> contador = new ArrayList<Integer>();
		contador.add(0);
		contador.add(0);
		int carta = 0;
		for (int i = 0; i < numeroCartas; i++) {
			carta = in.nextInt();
			if (carta == 0)
				contador.set(0, contador.get(0) + 1);
			else
				contador.set(1, contador.get(1) + 1);
		}

		if (contador.get(0) == 0)
			System.out.println(-1);
		else if (contador.get(1) < 9)
			System.out.println(0);
		else {
			for (int i = 0; i < contador.get(1) / 9; i++)
				System.out.print("555555555");
			for (int i = 0; i < contador.get(0); i++)
				System.out.print("0");
		}

	}
}
