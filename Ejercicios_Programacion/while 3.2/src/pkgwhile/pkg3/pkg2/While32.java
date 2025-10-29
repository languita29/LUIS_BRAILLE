/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgwhile.pkg3.pkg2;
import java.util.Scanner;
public class While32 {
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        int edad = 0;
        int suma = 0;
        int media = 0;
        int alumnos = 0;
        int mayor = 0;

        System.out.println("Indicame tu edad");
        edad = intro.nextInt();
        
        while (edad >= 0){
            suma = suma + edad;
            alumnos ++;
            if (edad >= 18){
                mayor ++;
            }
            System.out.println("Indicame tu edad");
            edad = intro.nextInt();
        }
        media = suma / alumnos;
        
        System.out.println("La suma de todas las edades es de" + suma );
        System.out.println("La media de todas las edades es de" + media );
        System.out.println("Hay" + alumnos + "alumnos" );
        System.out.println("De los cuales" + mayor + "mayor" );    
        
    }
    
}
