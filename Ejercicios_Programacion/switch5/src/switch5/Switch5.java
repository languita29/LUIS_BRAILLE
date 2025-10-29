/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package switch5;
import java.util.Scanner;
public class Switch5 {
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        double salario;
        System.out.println("Indicame tu salario");
        salario = intro.nextInt();
        if (salario < 1000){
            System.out.println("Muy malo");
        } else if (salario >= 1000 && salario < 1500 ) {
            System.out.println("Malo");
        } else if (salario >= 1500 && salario < 3000) {
            System.out.println("bueno");
        } else if (salario >= 3000){
            System.out.println("Muy bueno");
        }
    }
    
}
