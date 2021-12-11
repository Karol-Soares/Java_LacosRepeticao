package LacosRepeticao16;

import java.util.Scanner;

public class exercicio2For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);

        int x, num, par=0, impar=0;

        for (x=1;x<=10;x++) 
        {
            System.out.print("Insira o "+x+"º número: ");
            num = leia.nextInt();

            if(num%2==0) 
            {
                par++;
            } 
            else 
            	{
                	impar++;
            	}
        }
        System.out.println("Foram digitados "+par+" numeros pares e "+impar+" ímpares!");


	}

}
