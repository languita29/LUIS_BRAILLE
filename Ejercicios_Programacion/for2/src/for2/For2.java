/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package for2;
import java.util.Scanner;
public class For2 {
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
       int num;
        System.out.println("Indicame un nuemro");
        
        for(num = intro.nextInt(); num >= 0; num--){
            System.out.println(num);
        }
        
    }
    
}
