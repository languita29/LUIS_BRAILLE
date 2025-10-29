/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multiplos9;
import java.util.Scanner;
public class MediaFor {
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        float suma = 0;
        
        for(int i = 1; i<=10; i++ ){
            System.out.println("Indicame un numero");
            suma = suma + intro.nextFloat();
        }
        suma = suma / 10;
        System.out.println(suma);
    }
    
}
