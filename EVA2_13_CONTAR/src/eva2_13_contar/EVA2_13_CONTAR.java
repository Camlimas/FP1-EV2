/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_13_contar;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_13_CONTAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          String tex;
         int vocales=0;
         
        Scanner captu=new Scanner(System.in);
        
        System.out.println("Introduce el texto");
        tex =captu.nextLine();
        
      for(int i=0;i<tex.length();i ++){
          char car=tex.charAt(i);
          
          if(car=='a'|| car=='e' || car=='i' || car=='o' || car=='u'||
         car=='A'|| car=='E' || car=='I' || car=='O' || car=='U') {
            vocales++;
            System.out.println(vocales);
            
           
      }
         
      }
      
    }
    
}
