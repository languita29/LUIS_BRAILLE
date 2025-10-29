/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package for1;
import java.util.Scanner;
public class For1 {
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        int num;
        System.out.println("Indicame un numero");
        num = intro.nextInt();
        for (int i = 1; i<= num; i++){
            System.out.println(i + " eco");
        }    
    }
    
}
