/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_4_factorial;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_4_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int num,facto;
        Scanner captu =new Scanner(System.in);
        System.out.println("Interoduce el numero:");
        num=captu.nextInt();
        captu.nextLine();
       
          facto =1;
        for(int i=num; i>=1; i--){
            facto = facto * i;
    }
        
     System.out.println("Factorial = " + facto);
     
    }
    }
