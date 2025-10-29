/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package switch03;
import java.util.Scanner;
public class Switch03 {
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        int hora;
        int minutos;
        int segundos;
        System.out.println("Indicame los segundos");
        segundos = intro.nextInt();
        System.out.println("Indicame los minutos");
        minutos = intro.nextInt();
        System.out.println("Indicame las horas");
        hora = intro.nextInt();
        if (segundos < 59){
            segundos ++;
        } else if (segundos == 59) {
             segundos = 0;
             if (minutos < 59){
                minutos ++;
            } else if (minutos == 59){
                minutos = 0;
                if (hora < 59){
                    hora ++;
                } else if (hora == 24){
                hora = 0;
                }
            }
        }
        
        
        System.out.println("la hora +1 es" + hora + ":" + minutos + ":" + segundos);
    }  
}
