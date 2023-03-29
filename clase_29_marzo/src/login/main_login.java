package login;

import java.util.Scanner;

public class main_login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String user="admin";
		int pass=123,cont =1;
		while(user!="admin" || pass!=123 || cont<=3) 
		{
		System.out.println("Ingrese un usuario");	
		user = scan.nextLine().toLowerCase().toUpperCase();
		System.out.println("Ingrese un Password");
		pass= scan.nextInt();
		scan.nextLine();
		if(user.equals(user) && pass==123 ) {
			System.out.println("Ha ingresado al sistema");
			break;
		}
		else if(cont>=3) {
			System.out.println("Ha superado los limites");
			break;
		}
		
		cont++;
		}
	}

}
