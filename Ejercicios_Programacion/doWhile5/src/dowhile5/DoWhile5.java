/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dowhile5;
import java.util.Scanner;
public class DoWhile5 {
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        do {
            int contrase�a;
            int cont;
            cont = 543;
            System.out.println("indica una contrase�a");
            contrase�a = intro.nextInt();
        } while (contrase�a != cont){
            System.out.println("Contrase�a incorrecta vuelve a intentarlo");
            contrase�a = intro.nextInt(); 
        }
    }
    
}
