/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package asteriscos;
import java.util.Scanner;
public class ASTERISCOS {    
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        
        System.out.println("Indicame un numer");
        
        for(int num = intro.nextInt(); num >= 1; num--){
            for(int i = 1; i <= num; i++){
                System.out.print("*");
            }
            System.out.print('\n');
        }
    }
    
}
