package listamarina;
import java.util.Scanner;
public class Questao5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int A, B;
		System.out.println("digite o valor de A");
		A= input.nextInt();
		System.out.println("digite o valor de B");
		B= input.nextInt();
		if(A>10 || A+B==20)
		System.out.println("número válido");
		else
		System.out.println("número nao válido");
	
	}

}
