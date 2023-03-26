package listamarina;

import java.util.Scanner;

public class Questao2 {
	public static void main(String[] args) {
		int A,B;
		Scanner input = new Scanner(System.in);
		System.out.println("digite o valor de A");
		A= input.nextInt();
		System.out.println("digite o valor de B");
		B= input.nextInt();
		if (A<10) 
	    System.out.println("A<10");
	    else if (A+B==20)
		System.out.println("A+B==20");
		else
		System.out.println("numero nao valido");
	}
}
