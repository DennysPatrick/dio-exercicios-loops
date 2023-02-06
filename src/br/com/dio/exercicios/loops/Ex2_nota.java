package br.com.dio.exercicios.loops;
import java.util.Scanner;

public class Ex2_nota {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int nota;
		
		System.out.println("Informe a sua nota: ");
		nota = scan.nextInt();
		
		while(nota < 0 | nota > 10) {
			System.out.println("Nota inválida! Digite novamente: ");
			nota = scan.nextInt();
		}
		
			
			
		
		
		
	}

}
