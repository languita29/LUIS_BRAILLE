/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package while34.java;
import java.util.Scanner;
public class While34 {
    public static void main(String[] args) {
        Scanner intro =new Scanner(System.in);
        int num;
        int cont;
        cont = 0;
        System.out.println("indicame un numero positivo");
        num = intro.nextInt();
        while (num >= cont){
            System.out.println(num);
            num --;
            
        }
        
        System.out.println("Despegue");
    } 
}

