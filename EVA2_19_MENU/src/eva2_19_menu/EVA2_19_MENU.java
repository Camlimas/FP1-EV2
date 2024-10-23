/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_19_menu;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_19_MENU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String menu[];
       int precios[];
       
       Scanner captu=new Scanner(System.in);
       int cant;
       System.out.println("¿Cuantos productos tendra el menu?");
       cant=captu.nextInt();
       menu=new String[cant];//TAMAÑOS DE LOS ARREGLOS
       precios= new int[cant];
       captu.nextLine();
       
       for(int i =0; i<menu.length;i++){//simpre usar length en los ciclos
           
           System.out.println("Nombre del producto:");
           menu[i]=captu.nextLine();
             System.out.println("Prcios:");
           precios[i]=captu.nextInt();
           captu.nextLine();
           
           
       }
        for(int i=0; i<menu.length;i++){
        System.out.println(i + "-" + menu[i] + "$" + precios[i]);
        }
    
    
       
       
    }
    
}
