package br.edu.unoesc;

import java.time.LocalDate;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);		

		try {
			System.out.println("Digite uma data futura que deseja calcular?");
			System.out.println("Digite no formato (yyyy-MM-dd)");
			String data = scan.next();

			LocalDate dataConvertida = LocalDate.parse(data);

			Metodos.contaTempo(dataConvertida);
		} catch (Exception e) {
			System.out.println("ATENÇÃO! - Formato da data inválido!");
		} finally {
			scan.close();
		}
	}

}
