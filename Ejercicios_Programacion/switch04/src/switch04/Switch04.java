/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package switch04;
import java.util.Scanner;
public class Switch04 {
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        int dia;
        int año;
        int mes;
        System.out.println("Indicame el dia que es");
        dia = intro.nextInt();
        System.out.println("Indicame el mes que es");
        mes = intro.nextInt();
        System.out.println("Indicame el año que es");
        año = intro.nextInt();
        switch (mes){
            case 4, 6, 9, 11 -> {
                if (dia < 30){
                    dia ++;
                } else if (dia == 30){
                    dia =1;
                    if (mes < 12){
                        mes ++;
                    } else if (mes == 12){
                        mes = 1;
                        año ++;
                    } else {
                        System.out.println("Los numeros proporcionados son incorrectos");
                    }
                } else {
                    System.out.println("Los numeros proporcionados son incorrectos");
                }
            }
            case 2 -> {
                if (dia < 28){
                    dia ++;
                } else if (dia == 28){
                    dia =1;
                    if (mes < 12){
                        mes ++;
                    } else if (mes == 12){
                        mes = 1;
                        año ++;
                    } else {
                        System.out.println("Los numeros proporcionados son incorrectos");
                    }
                } else {
                    System.out.println("Los numeros proporcionados son incorrectos");
                }
            }
            case 1, 3, 5, 7, 8, 10, 12 -> {
                if (dia < 31){
                    dia ++;
                } else if (dia == 31){
                    dia =1;
                    if (mes < 12){
                        mes ++;
                    } else if (mes == 12){
                        mes = 1;
                        año ++;
                    } else {
                        System.out.println("Los numeros proporcionados son incorrectos");
                    }
                } else {
                    System.out.println("Los numeros proporcionados son incorrectos");
                }
            }
            default -> System.out.println("Los numeros proporcionados son incorrectos");
        }
        System.out.println("Mañana sera " + dia + ":" + mes + ":" + año );
    }
    
}
