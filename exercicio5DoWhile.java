package LacosRepeticao16;

import java.util.Scanner;

public class exercicio5DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int x = 0,soma=0;
		
		do
		{
			soma += x;
			System.out.println("\nDigite um número: ");
			x =leia.nextInt();


		}while(x!=0);

		System.out.println("A soma dos números foi de: "+soma);

	}

}
