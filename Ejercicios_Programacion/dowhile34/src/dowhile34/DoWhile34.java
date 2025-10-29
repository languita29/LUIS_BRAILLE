/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dowhile34;
import java.util.Scanner;
public class DoWhile34 {
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        String elegido;
        int num1;
        int num2;
        int sumar;
        int restar;
        int multiplicar;
        
        System.out.println("Indicame que opcion eliges sumar, restar, multiplicar");
        elegido = intro.next();
        System.out.println("Indicame el primer numero");
        num1 = intro.nextInt();
        System.out.println("Indicame el segundo numero");
        num2 = intro.nextInt();
        
        switch (elegido) {
            case "sumar" -> {
                sumar = num1 + num2;
                System.out.println(sumar);
            }
            case "restar" -> {
                restar = num1 - num2;
                System.out.println(restar);
            }
            case "multiplicar" -> {
                multiplicar = num1 * num2;
                System.out.println(multiplicar);
            }
            default ->{
                System.out.println("No es ninguna de las anteriores");
            }
        }      
    }
    
}
