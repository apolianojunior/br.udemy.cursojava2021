package conceitosBasicos;

import java.util.Scanner;

public class Questao3 {
	
	public static void main(String[] args) {
		// 3) Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC.
	// É calculado dividindo o peso (em kg) pela altura ao quadrado (em metros).

	
	  Scanner entrada = new Scanner(System.in);
	  System.out.println("Digite seu peso:"); 
	  double peso = entrada.nextDouble();
	  
	  System.out.println("Digite sua altura:"); 
	  double altura = entrada.nextDouble();
	  
	  double IMC = peso / (altura*altura); 
	  System.out.println("Seu IMC é de: " +IMC);
	  
	  entrada.close();
	
	}

}
