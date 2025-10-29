/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numercomprendidos;

import java.util.Scanner;

public class NumerComprendidos {

    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        int num;
        double altura;
        double radio;
        System.out.println("indicame 1 si quieres calcular el area y 2 si quieres calcular el volumen");
        num = intro.nextInt();
        System.out.println("indicame la altura en cm");
        altura = intro.nextDouble();
        System.out.println("indicame el radio");
        radio = intro.nextDouble();
        calculoCilindro(num, altura, radio);
    }

    static void calculoCilindro(int num, double altura, double radio) {
        double resultado;
        final double PI = Math.PI;
        if (num == 1) {
            resultado= (2 * PI) * radio * (altura + radio);
            System.out.println(resultado);
        } else if (num == 2){
            resultado = PI * Math.pow(radio, 2)* altura;
             System.out.println(resultado);
        } else {
            System.out.println("el numero dado no es correcto");
        }
    }
}
