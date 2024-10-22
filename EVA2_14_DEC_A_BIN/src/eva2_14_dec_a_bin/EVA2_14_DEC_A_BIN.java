/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_14_dec_a_bin;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_14_DEC_A_BIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        String bin="";
        Scanner captu=new Scanner(System.in);
        
         System.out.println("INGRESA UN NUMERO ENTERO:");
         num=captu.nextInt();
         captu.nextLine(); 
             
    if(num==0){
        bin="0";
        
    }else{
        while(num>0){ 
        int resto= num%2;
        bin=resto +bin;
        num= num /2;  
    }
    }
    System.out.println("EL NUMERO EN BINARIO ES:" +bin);
   }
    
}
