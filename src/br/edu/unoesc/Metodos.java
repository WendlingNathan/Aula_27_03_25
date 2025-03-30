package br.edu.unoesc;

import java.time.LocalDate;
import java.time.Period;

public class Metodos {
	
	public static void contaTempo(LocalDate data) {	
		
		LocalDate primeiraData = LocalDate.now();
		LocalDate segundaData = data;
		
		int dias = 0, meses = 0, anos = 0;
		
		if(primeiraData.isBefore(segundaData)) {
			Period periodo = Period.between(primeiraData, segundaData);
			dias = periodo.getDays();
			meses = periodo.getMonths();
			anos = periodo.getYears();
			
			System.out.printf("Faltam "
									+ "%d ano(s), "
									+ "%d mês(es) e "
									+ "%d dia(s) para essa data chegar!", anos, meses, dias);
		} else {
			System.out.println("Você precisa digitar uma data futura em relação a atual!");
		}
	}
}
