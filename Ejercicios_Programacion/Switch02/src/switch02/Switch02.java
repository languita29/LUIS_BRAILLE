/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package switch02;
import java.util.Scanner;
public class Switch02 {
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        int dia;
        int mes;
        int anyo;
        System.out.println("Indicame el año");
        anyo = intro.nextInt();
        System.out.println("indicame el mes");
        mes = intro.nextInt();
        System.out.println("Indicame el dia");
        dia = intro.nextInt();
        if (anyo <= 2025 && anyo > 0){
            if (mes>=1 && mes<=12 ){
                switch (mes) {
                    case 4, 6, 9, 11 -> {
                        if (dia > 0 && dia <= 30) {
                            System.out.println("Fecha correcta");
                        } else {
                            System.out.println("No es correcta");
                        }
                    }
                    case 2 -> {
                        if (dia <= 28){
                            System.out.println("La fecha es correcto");   
                        } else {
                            System.out.println("El dia es incorrecto");
                        }
                    }
                    case 1,3,5,7,8,10,12 -> {
                        if (dia >=1 && dia <= 31){
                            System.out.println("La fecha es correcta");
                        } else {
                            System.out.println("El dia no es correcto");
                        }
                    }
                }
            }
        }else{
            System.out.println("El anyo que has indicado no es correcto");
        } 
    }
}
