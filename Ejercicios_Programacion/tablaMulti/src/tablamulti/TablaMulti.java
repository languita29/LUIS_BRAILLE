/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tablamulti;

public class TablaMulti {

    public static void main(String[] args) {
        for (int i = 1; i  <= 10; i++) {
            if (i == 5){
                continue;
            }
            for (int a = 1; a  <= 10; a++) {
                System.out.println(i + " * " + a + " = " + i*a);
            }
            System.out.println("-----------------------------");
        }

    }

}
