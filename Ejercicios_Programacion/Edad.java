import java.util.Scanner;
public class Edad {
	public static void main (String[] arg){
		Scanner intro = new Scanner(System.in);
		int edad;
		
		System.out.println("Indicame tu edad");
		edad = intro.nextInt();
		edad ++;
		System.out.print("En un año tendras " + edad + " años" );
	}
	
}

