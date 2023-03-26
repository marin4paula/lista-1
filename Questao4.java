package listamarina;
import java.util.Scanner;
public class Questao4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int A, B;
		System.out.println("digite o valor de A");
		A= input.nextInt();
		System.out.println("digite o valor de B");
		B= input.nextInt();
		if(A>10 || A+B==20)
			System.out.println("número válido");
		else if(A==B)
			System.out.println("A e igual a B; A e B sao diferentes de 10; A e menor que 10");
		else
			System.out.println("número não válido");
		
		
		
	}
	
	

}
