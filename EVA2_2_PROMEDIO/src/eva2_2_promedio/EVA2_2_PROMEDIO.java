/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_2_promedio;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_2_PROMEDIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here}
        int califa, acum;
        Scanner captu=new Scanner(System.in);
        acum=0;
        
        for(int i=1; i<=10;i++){
        System.out.println("Estudiante #" + i);
        System.out.println("Introduce la calificacion:");
        califa = captu.nextInt();
        captu.nextLine();
        acum = acum+califa;
       }
        
        System.out.println("acum = " + acum);
        System.out.println("Promedio = " + (acum /10.0));
        
        
    }
    
}
