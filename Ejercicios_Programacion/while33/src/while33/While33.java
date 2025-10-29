/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package while33;
import java.util.Scanner;
public class While33 {
    public static void main(String[] args) {
       Scanner intro = new Scanner(System.in);
       int num;
       int numSecreto;
       numSecreto = (int) (Math.random()* 100 + 1);
        System.out.println("Indicame un numero entre 1 y 100");
        num = intro.nextInt();
        while (num != numSecreto && num != -1 ){
            System.out.println("Vuelvelo a intentar indica otro numero");
            num = intro.nextInt();
            if (num == numSecreto){
                System.out.println("Has acertado");
            }
        }    
    }
    
}
