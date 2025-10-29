import java.util.Scanner;

public class Edad2{
	public static void main (String[] arg){
		Scanner intro = new Scanner (System.in);
		
		int fecha1;
		int fecha2;
		int rest;
		
		System.out.println("Dime tu fecha de nacimiento");
		fecha1 = intro.nextInt();
		System.out.println("Dime el fecha en el que estas");
		fecha2 = intro.nextInt(); 
		rest = fecha2 - fecha1;
		System.out.println ("Tienes " + rest);
	}
}