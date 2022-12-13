package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramSomaVetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Quantos números vc vai digitar? ");
		int n = sc.nextInt();
		double [] vect = new double [n];
		double soma = 0.0;
		double media = 0.0;
		
		for (int i=0; i<n; i++) {
			System.out.print("Digite um número: ");
			vect[i]= sc.nextDouble();		
		}
		
		//Preenchendo o vetor e calculando a soma dos elementos do vetor
		for (int i=0; i<n; i++) {
			soma +=  (vect[i]);					
		}
		
		media = soma/vect.length;
		
		System.out.print("VALORES = ");	
		for (int i=0; i<n; i++) {			
			System.out.printf(" %.1f", vect[i]);			
		}
		
		System.out.printf("\nSOMA = %.2f\n", soma);	
		System.out.printf("MEDIA = %.2f\n", media);
		
		sc.close();

	}

}
