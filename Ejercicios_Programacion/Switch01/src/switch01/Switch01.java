/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package switch01;
import java.util.Scanner;
public class Switch01 {
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
       int num;
        System.out.println("Indicame un numero de 1-7");
        num = intro.nextInt();
        switch (num){
            case 1:
                System.out.println("lunes");
                break;
            case 2:
                System.out.println("martes");
                break;
            case 3:
                System.out.println("miercoles");
                break;
            case 4:
                System.out.println("jueves");
                break;
            case 5:
                System.out.println("viernes");
                break;
            case 6:
                System.out.println("sabado");
            case 7:
                System.out.println("domingo");
                break;
            default:
                System.out.println("Numero invalido");
            
        }
        
    }
    
}
