/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vocal.java;
import java.util.Scanner;
public class VocalJava {
    public static void main(String[] args) {
      char letra = 'b';
      System.out.println("la letra "+letra+" es vocal o no "+vocal(letra));
    }
    static boolean vocal (char a){
        if (a == 'a' || a == 'e'||a =='i'|| a == '0' || a =='u' ||a =='A' || a == 'E'||a =='I'||a =='O' ||a =='U'){
            return (true);
        } else {
            return(false);
        }   
    }
}
