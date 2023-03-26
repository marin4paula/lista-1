package listamarina;
import java.util.Scanner;
public class Questao13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int A, B;
		System.out.println("digite o valor de A");
		A= input.nextInt();
		System.out.println("digite o valor de B");
		B= input.nextInt();
		if(A>10)
			System.out.println("A > 10");	
		if(A+B==20)
			System.out.println("A+B==20");	
		else
			System.out.println("numeros nao validos");	
	
	}
}
