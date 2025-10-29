/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multiplos8;
import java.util.Scanner;
public class TablaMulti {
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        int num;
        System.out.println("Indicame un numero");
        num = intro.nextInt();
        for (int i = 0; i<= 10; i++){
            System.out.println(num * i );
        }
        
    }
    
}
