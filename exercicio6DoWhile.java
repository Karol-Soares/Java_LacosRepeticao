package LacosRepeticao16;

import java.util.Scanner;

public class exercicio6DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int num,somaMedia=0;
		float media;
		
		System.out.println("\nDigite um valor: ");
		num = leia.nextInt();
		
		do
		{
			if(num%3==0)
			{
				somaMedia += num;
			}
			System.out.println("\nDigite um valor: ");
			num = leia.nextInt();
		}
		while (num != 0);
		
		media = (float) somaMedia;
		System.out.println("\nA média dos números múltiplos de 3 é: "+ media);
		
	}

}
