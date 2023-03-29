package numeros_1;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num,x,suma=0,cont=0;
		System.out.println("Ingrese la cantidad de numeros");
		num = scan.nextInt();
		for(int i=1; i<=num;i++) 
		{
			System.out.println("Ingrese un numero");
			x = scan.nextInt();
			if(x>0) 
			{
				suma =suma+x;
				System.out.println("La suma de los numeros es :"+suma);
			}
			else
			{
			System.out.println("["+i+"]"+""+x);	
			}
		}

	}

}
