/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_12_numero_mayor;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_12_NUMERO_MAYOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num,masGrande =-9999;

         Scanner captu =new Scanner (System.in);
        
         
         
          do{
         System.out.println("INGRESA UN NUMERO ENTERO POSITIVO:");
         num= captu.nextInt(); 
 
         if(num>masGrande)
             masGrande = num;
         
           }  while(num != -1 );
          
             System.out.println("EL NUMERO MAS GRANDE ES:" +masGrande);
         
    }
    
}
