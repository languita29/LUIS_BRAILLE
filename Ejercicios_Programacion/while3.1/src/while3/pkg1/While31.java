/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package while3.pkg1;
import java.util.Scanner;
public class While31 {
    public static void main(String[] args) {
        Scanner intro= new Scanner(System.in);
        int num;
        System.out.println("Introduce un numero");
        num = intro.nextInt();
        while (num !=0){
            if (num %2 ==0){
                System.out.println("Es par");
            } else {
                System.out.println("es impar");
            }
            if (num >= 0 ){
                System.out.println("es positivo");
            } else {
                System.out.println("es negativo");
            }
            System.out.println("El cuadaradi de " +num+ " es " + num*num);
            System.out.println("Dame un nuevo numero");
            num = intro.nextInt();

        }
    }
    
}
