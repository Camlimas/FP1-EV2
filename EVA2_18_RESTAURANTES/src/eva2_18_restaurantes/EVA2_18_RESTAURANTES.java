/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_18_restaurantes;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_18_RESTAURANTES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String menu[]={"Dogos","Hamburguesas","Boneless","Tacos","Montados","Camarones"};
       Scanner captu =new Scanner(System.in);
       int precios[] = {50,80,120,150,7,200};
       for(int i=0; i<menu.length;i++){
       System.out.println(i + "-" + menu[i] + "$" + precios[i]);
       
       }
       System.out.println("¿Cual es tu orden?(Introduce el numero del producto):");
       int producto= captu.nextInt();
       captu.nextLine();
       System.out.println("¿Cuantas ordenes?");
       int cantidad =captu.nextInt();
       captu.nextLine();
       
       System.out.println("El costo es de :" + cantidad*precios [producto]);
    }
    
}
